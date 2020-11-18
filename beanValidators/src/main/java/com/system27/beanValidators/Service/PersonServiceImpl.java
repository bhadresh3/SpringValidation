package com.system27.beanValidators.Service;

import com.system27.beanValidators.Model.Person;
import com.system27.beanValidators.Repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepo  personRepo;

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepo.findAll();
    }

    @Override
    public Person addPerson(Person person) {
        return personRepo.save(person);
    }
}
