package com.system27.beanValidators.Service;

import com.system27.beanValidators.Model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person addPerson(Person person);
}
