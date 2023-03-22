package com.example.epamintensivetask.controller;

import com.example.epamintensivetask.entity.Person;
import com.example.epamintensivetask.request_response.PersonRequest;
import com.example.epamintensivetask.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/register")
    public boolean register
            (@RequestBody PersonRequest personRequest) {
        ResponseEntity.ok(personService.register(personRequest));
        return true;
    }

    @GetMapping("/show")
    public ResponseEntity<List<Person>> showAll() {
        return ResponseEntity.ok(personService.showAllPersons());
    }

}
