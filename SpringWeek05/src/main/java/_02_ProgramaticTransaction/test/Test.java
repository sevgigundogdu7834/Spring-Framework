package _02_ProgramaticTransaction.test;

import _02_ProgramaticTransaction.model.Adress;
import _02_ProgramaticTransaction.model.Person;
import _02_ProgramaticTransaction.repository.RepoIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/app.xml");
       RepoIml repoIml= context.getBean(RepoIml.class);

        Person person=new Person(1,"Sevgi","Gündoğdu",2300);
        Adress adress=new Adress(13,"İstanbul","Esenler");

        person.setAdress(adress);

        repoIml.insertPerson(person);
    }
}
