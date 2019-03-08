package _01_AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/appContext2.xml");
        Employee1 employee1 =context.getBean("employeeId", Employee1.class);

        System.out.println(employee1);
    }
}
