package ru.netology.daohibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daohibernate.repository.Repository;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public String getPersons(String city) {
        return repository.getPersonsByCity(city).toString();
    }
}
