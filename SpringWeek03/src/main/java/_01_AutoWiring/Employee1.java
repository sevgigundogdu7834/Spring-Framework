package _01_AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee1 {

    private String name;
    private String surname;
    private int salary;

    @Autowired
    @Qualifier(value = "adressId1")
    private Adress adress;
    @Autowired
    private Department department;

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
        return "Employee1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", adress=" + adress +
                ", department=" + department +
                '}';
    }
}
