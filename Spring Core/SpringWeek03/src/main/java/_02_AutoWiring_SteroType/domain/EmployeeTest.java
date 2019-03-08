package _02_AutoWiring_SteroType.domain;

import _02_AutoWiring_SteroType.service.EmployeeServiceIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/appContext2.xml");
        EmployeeServiceIml employeeServiceIml=context.getBean("employeeServiceIml", EmployeeServiceIml.class);

        Employee employee=context.getBean("employee",Employee.class);

        employeeServiceIml.saveEmployee(employee);

        System.out.println(employee);



    }


}
