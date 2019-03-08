package _04_javaBasedConf.test;

import _04_javaBasedConf.configiration.JavaBasedConf;
import _04_javaBasedConf.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(JavaBasedConf.class);
        Person person=context.getBean(Person.class);

        System.out.println(person);
    }
}
