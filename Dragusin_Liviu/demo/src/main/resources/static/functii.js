const adaugaButton = document.getElementById('adaugaButton');
const sectiuneAdauga = document.getElementById('sectiuneAdauga');

// Adăugăm un eveniment de tip click pe buton
adaugaButton.addEventListener('click', function() {
	// Facem secțiunea vizibilă când butonul este apăsat
	sectiuneAdauga.classList.toggle('d-none');
});

async function loadSarcini() {
    try {
        // Obținem datele din API (presupunând că endpoint-ul este '/api/sarcini')
        const response = await fetch('/api/sarcini');
        
        // Verificăm dacă răspunsul este OK (status 200)
        if (!response.ok) {
            console.error('Eroare la preluarea datelor.');
            return;
        }

        // Preluăm datele în format JSON
        const sarcini = await response.json();

        // Selectăm tbody-ul tabelului în care vom insera datele
        const tbody = document.querySelector('#sarciniTable tbody');

        // Golește tabelul înainte de a adăuga noile date
        tbody.innerHTML = '';

        // Adăugăm fiecare sarcină în tabel
        sarcini.forEach(sarcina => {
            // Creăm un rând pentru fiecare sarcină
            const tr = document.createElement('tr');
            
            // Adăugăm celulele corespunzătoare fiecărui câmp din sarcină
            tr.innerHTML = `
                <td>${sarcina.titlu}</td>
                <td>${sarcina.descriere}</td>
                <td>${sarcina.dataSpecifica}</td>
				<td>${sarcina.oraSpecifica}</td>
            `;
            
            // Adăugăm rândul în tabel
            tbody.appendChild(tr);
        });
    } catch (error) {
        console.error('A apărut o eroare la prelucrarea datelor:', error);
    }
}

window.onload = loadSarcini;