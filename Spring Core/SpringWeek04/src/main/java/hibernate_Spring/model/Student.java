package hibernate_Spring.model;

import javax.persistence.*;

@Entity
@Table(name = "Öğrenci Bilgileri")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "st_id")
    private int id;
    @Column(name = "st_name")
    private String name;
    @Column(name = "st_surname")
    private String surname;
    @Column(name = "st_salary")
    private int salary;

    public Student() {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
