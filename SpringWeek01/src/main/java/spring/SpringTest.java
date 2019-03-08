package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext.xml");

       Car car= applicationContext.getBean("carId",Car.class);
       car.drive();

    }
}
