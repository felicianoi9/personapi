package br.com.felicianoi9.personapi.repository;

import br.com.felicianoi9.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
