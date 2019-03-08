package _03_JSR330.repository;

import _03_AutoWiring_SteroType.domain.Person;
import _03_AutoWiring_SteroType.repository.PersonRepositoryInt;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

//@Repository
@Named
public class PersonRepositoryIml implements PersonRepositoryInt {

    public void saveEmployee(Person person) {

        System.out.println("PersonRepositoryIml # saveEmployee");
    }
}
