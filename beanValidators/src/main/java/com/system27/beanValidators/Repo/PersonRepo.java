package com.system27.beanValidators.Repo;

import com.system27.beanValidators.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {
}
