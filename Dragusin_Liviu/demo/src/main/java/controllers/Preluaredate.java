package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import repository.SarcinaRepository;
import structures.Sarcina;

import java.util.List;

@RestController
public class Preluaredate {

	@Autowired
    private SarcinaRepository sarcinaRepository;

    public void UserController(SarcinaRepository repository) {
        this.sarcinaRepository = repository;
    }

    @GetMapping("/api/sarcini")
    public List<Sarcina> getAllSarcini() {
        return sarcinaRepository.findAll(); // Returnează toate sarcinile din baza de date
    }
}
