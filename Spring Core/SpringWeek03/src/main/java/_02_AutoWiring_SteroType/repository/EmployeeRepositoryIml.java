package _02_AutoWiring_SteroType.repository;

import _01_AutoWiring.Employee1;
import org.springframework.stereotype.Repository;
import _02_AutoWiring_SteroType.domain.Employee;

@Repository
public class EmployeeRepositoryIml implements EmployeeRepositoryInt {

    public void saveEmployee(Employee employee) {

        System.out.println("PersonRepositoryIml  #   saveEmployee") ;
    }
}
