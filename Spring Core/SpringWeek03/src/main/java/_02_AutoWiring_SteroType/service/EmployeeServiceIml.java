package _02_AutoWiring_SteroType.service;

import _02_AutoWiring_SteroType.domain.Employee;
import _02_AutoWiring_SteroType.repository.EmployeeRepositoryIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIml implements EmployeeServiceInt {

    @Autowired
    private EmployeeRepositoryIml employeeRepositoryIml;

    public void saveEmployee(Employee employee) {

        employeeRepositoryIml.saveEmployee(employee);

    }
}
