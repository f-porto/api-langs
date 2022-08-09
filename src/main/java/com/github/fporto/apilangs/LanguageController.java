package com.github.fporto.apilangs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @GetMapping(value = "/hello-world")
    public String getHelloWorld() {
        return "Hello, World!";
    }

    @GetMapping(value = "/all-langs")
    public List<Language> getAllLangs() {
        return languageRepository.findAll();
    }

    @PostMapping(value = "/new-lang")
    public Language postNewLAng(@RequestBody Language language) {
        // TODO: Retorna com o status code correto, 201 Created
        return languageRepository.save(language);
    }

    // TODO: adicionar mais endpoints

}
