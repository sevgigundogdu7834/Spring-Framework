package bean_Factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext.xml");
        Car car=applicationContext.getBean("carId",Car.class);
        car.drive();

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

        Car car1 = (Car) factory.getBean("carId");


        car1.drive();


    }
}
