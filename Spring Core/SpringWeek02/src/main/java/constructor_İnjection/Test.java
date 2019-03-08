package constructor_İnjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContextCons.xml");
        Employee employee=applicationContext.getBean("EmployeeId",Employee.class);
        Employee employee1=applicationContext.getBean("EmployeeId2",Employee.class);
        Employee employee2=applicationContext.getBean("EmployeeId3",Employee.class);


        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
