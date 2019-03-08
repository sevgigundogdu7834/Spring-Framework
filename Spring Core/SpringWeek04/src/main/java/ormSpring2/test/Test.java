package ormSpring2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import orm_Spring.model.Employee;
import orm_Spring.repository.EmployeeRepoIml;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/jpaSpring2.xml");
       EmployeeRepoIml employeeRepoIml= context.getBean( EmployeeRepoIml.class);

        Employee employee=new Employee();
        employee.setName("Aydan");
        employee.setSurname("Dinçer");
        employee.setSalary(23000);

       employeeRepoIml.saveEmployee(employee);
       Employee found=employeeRepoIml.findById(1);
        System.out.println(found);

        List<Employee> employeeList=employeeRepoIml.allEmployee();
        employeeList.forEach(System.out::println);
        
        employee.setSalary(34000);

        employeeRepoIml.updateEmployee(employee);

        employeeRepoIml.deleteEmployee(1);
        List<Employee> employeeList1=employeeRepoIml.allEmployee();
        employeeList1.forEach(System.out::println);
    }
}
