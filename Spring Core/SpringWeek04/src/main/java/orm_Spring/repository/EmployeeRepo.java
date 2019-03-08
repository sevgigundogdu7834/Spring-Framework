package orm_Spring.repository;

import orm_Spring.model.Employee;
import java.util.List;

public interface EmployeeRepo {

    public void saveEmployee(Employee employee);
    public Employee findById(int id);
    public List<Employee> allEmployee();
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);
}
