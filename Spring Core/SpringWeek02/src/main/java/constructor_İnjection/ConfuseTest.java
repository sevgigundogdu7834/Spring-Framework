package constructor_İnjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfuseTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContextConstConfuse.xml");
        ConstructorConfuse constructorConfuse=applicationContext.getBean("StringConfuse",ConstructorConfuse.class);
        ConstructorConfuse constructorConfuse1=applicationContext.getBean("StringConfuse1",ConstructorConfuse.class);


        System.out.println(constructorConfuse);
        System.out.println(constructorConfuse1);
    }
}
