package controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;
import repository.SarcinaRepository;
import structures.Sarcina;
@Controller
@Slf4j
public class SarcinaController {

	@Autowired
    private final SarcinaRepository sarcinaRepository;

    public SarcinaController(SarcinaRepository sarcinaRepository) {
        this.sarcinaRepository = sarcinaRepository;
    }

    @RequestMapping(path = "/adauga-sarcina", method = RequestMethod.POST)
    public String contactFormSubmission(@ModelAttribute final Sarcina sarcina) {

        Sarcina sarcinaSalvata = sarcinaRepository.save(sarcina);
        
        System.out.println("Sarcina salvată: " + sarcinaSalvata);

        return "redirect:/index.html";
    }
    
}
