package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StpringTestConf {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Car car=applicationContext.getBean("car",Car.class);
        car.drive();

    }
}
