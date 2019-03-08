package _03_AutoWiring_SteroType.domain;

import _03_AutoWiring_SteroType.service.PersonServiceIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/appContext3.xml");
        Person person=context.getBean("person",Person.class);
        PersonServiceIml personServiceIml=context.getBean("personServiceIml", PersonServiceIml.class);

        System.out.println(person);
        personServiceIml.savePerson(person);
    }
}
