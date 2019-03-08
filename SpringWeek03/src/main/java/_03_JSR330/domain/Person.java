package _03_JSR330.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Person {

    @Value(value = "Naciye")
    private String name;
    @Value(value = "Turgut")
    private String surname;
    @Value(value = "3400")
    private int salary;

   @Inject
    private Adress adress;
    @Inject
    private Department department;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", adress=" + adress +
                ", department=" + department +
                '}';
    }
}
