package _01_jdbc.test;

import _01_jdbc.model.Person;
import _01_jdbc.repository.PersonRepositoryIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/appcontext1.xml");
       PersonRepositoryIml personRepositoryIml= context.getBean("personDAOImplId", PersonRepositoryIml.class);

        Person person=new Person(1,"Sevgi","Gündoğdu",1994);
        Person person1=new Person(2,"Gülnaz","Aktaş",1993);
        Person person2=new Person(3,"Sumru","Aydemir",1992);
       personRepositoryIml.insertPerson(person);
       personRepositoryIml.insertPerson(person1);
       personRepositoryIml.insertPerson(person2);
       personRepositoryIml.findById(1);
       personRepositoryIml.findById(2);
       personRepositoryIml.findById(3);
       personRepositoryIml.allPerson();

       person1.setName("İbrahimmmmm");
       personRepositoryIml.updatePerson(person);
       personRepositoryIml.deletePerson(person);

       personRepositoryIml.allPerson();

    }
}
