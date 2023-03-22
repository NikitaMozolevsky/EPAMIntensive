package com.example.epamintensivetask.service;

import com.example.epamintensivetask.entity.Person;
import com.example.epamintensivetask.repository.PersonRepository;
import com.example.epamintensivetask.request_response.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> showAllPersons() {
        return personRepository.findAll();
    }

    public boolean register(PersonRequest request) {
        //настройка пользователя
        var user = Person.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                //changed!!! from "Role.USER"
                .role(request.getRole())
                .build();

        //сохранение
        personRepository.save(user);
        return true;
    }
}
