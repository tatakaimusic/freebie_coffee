package ru.test.freebie_coffee.repositories;

import ru.test.freebie_coffee.models.Person;

import java.util.List;

public interface PersonRepository {
    Person save(Person person);

    boolean delete(int id);

    Person get(int id);

    List<Person> getAll();
}
