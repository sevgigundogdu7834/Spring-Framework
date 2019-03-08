package _02_AutoWiring_SteroType.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {


    @Value(value = "Şahin")
    private String name;
    @Value(value = "Gündoğdu")
    private String surname;
    @Value(value = "23000")
    private int salary;

    @Autowired
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", adress=" + adress +
                ", department=" + department +
                '}';
    }
}
