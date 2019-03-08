package _03_AutoWiring_SteroType.repository;

import _03_AutoWiring_SteroType.domain.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryIml implements PersonRepositoryInt {

    public void saveEmployee(Person person) {

        System.out.println("PersonRepositoryIml # saveEmployee");
    }
}
