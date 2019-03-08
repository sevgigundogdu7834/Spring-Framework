package _03_AutoWiring_SteroType.service;

import _03_AutoWiring_SteroType.domain.Person;
import _03_AutoWiring_SteroType.repository.PersonRepositoryIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceIml implements PersonServiceInt {

    @Autowired
    private PersonRepositoryIml personRepositoryIml;

    public void savePerson(Person person) {

        personRepositoryIml.saveEmployee(person);
    }
}
