package setter_DependecyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("file:src/main/resources/applicationContextSetter.xml");
        Employee employee=applicationContext.getBean("EmployeeId",Employee.class);

        System.out.println(employee);

    }
}
