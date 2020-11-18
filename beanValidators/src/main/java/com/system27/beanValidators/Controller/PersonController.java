package com.system27.beanValidators.Controller;

import com.system27.beanValidators.Model.Person;
import com.system27.beanValidators.Service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> findAll(){
        return personService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Person addPerson(@RequestBody @Valid Person person){
        return personService.addPerson(person);
    }


}
