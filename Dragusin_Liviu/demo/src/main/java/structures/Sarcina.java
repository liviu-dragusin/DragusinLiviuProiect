package structures;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Sarcina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generare automată a ID-ului
    private Long ID;

    private String TITLU;

    private String DESCRIERE;
    
    private LocalDate DATA_SPECIFICA;
    
    private LocalTime ORA_SPECIFICA;

    // Constructor fără argumente (necesar pentru JPA)
    public Sarcina() {
    }

    // Constructor complet
    public Sarcina(String TITLU, String DESCRIERE, LocalDate DATA_SPECIFICA, LocalTime ORA_SPECIFICA) {
        this.TITLU = TITLU;
        this.DESCRIERE = DESCRIERE;
        this.DATA_SPECIFICA = DATA_SPECIFICA;
        this.ORA_SPECIFICA = ORA_SPECIFICA;
    }

    // Getters și setters
    public Long getId() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = id;
    }

    public String getTitlu() {
        return TITLU;
    }

    public void setTitlu(String titlu) {
        this.TITLU = titlu;
    }

    public String getDescriere() {
        return DESCRIERE;
    }

    public void setDescriere(String descriere) {
        this.DESCRIERE = descriere;
    }

    public LocalDate getDataSpecifica() {
        return DATA_SPECIFICA;
    }

    public void setDataSpecifica(LocalDate dataSpecifica) {
        this.DATA_SPECIFICA = dataSpecifica;
    }

    public LocalTime getOraSpecifica() {
        return ORA_SPECIFICA;
    }

    public void setOraSpecifica(LocalTime oraSpecifica) {
        this.ORA_SPECIFICA = oraSpecifica;
    }

    @Override
    public String toString() {
        return "Sarcina{" +
               "id=" + ID +
               ", titlu='" + TITLU + '\'' +
               ", descriere='" + DESCRIERE + '\'' +
               ", dataSpecifica=" + DATA_SPECIFICA +
               ", oraSpecifica=" + ORA_SPECIFICA +
               '}';
    }
}
