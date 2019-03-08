package beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContextBean.xml");
        Student student=context.getBean("employeeId",Student.class);
        Student student1=context.getBean("employeeId",Student.class);
        Student student2=context.getBean("employeeId",Student.class);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1==student);

        // bean scope varsayılan olarak singletondır.

        Employee employee=context.getBean("employeeId1",Employee.class);
        Employee employee1=context.getBean("employeeId1",Employee.class);
        Employee employee2=context.getBean("employeeId1",Employee.class);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println(employee1==employee2);


    }
}
