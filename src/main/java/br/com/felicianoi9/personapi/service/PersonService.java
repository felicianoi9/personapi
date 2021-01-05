package br.com.felicianoi9.personapi.service;

import br.com.felicianoi9.personapi.dto.response.MessageResponseDTO;
import br.com.felicianoi9.personapi.entity.Person;
import br.com.felicianoi9.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(Person person) {
        Person savePerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Saved person with id "+ savePerson.getId())
                .build();
    }



}
