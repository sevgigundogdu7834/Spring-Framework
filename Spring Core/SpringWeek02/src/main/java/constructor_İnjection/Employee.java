package constructor_İnjection;

public class Employee {

    private String name;
    private String surname;
    private int salary;

    private Department department;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee(String name, String surname, int salary, Department department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
