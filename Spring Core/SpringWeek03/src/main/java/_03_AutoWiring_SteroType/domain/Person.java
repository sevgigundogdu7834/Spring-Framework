package _03_AutoWiring_SteroType.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("configure.properties")
public class Person {

    @Value(value = "${name}")
    private String name;
    @Value(value = "${surname}")
    private String surname;
    @Value(value = "${salary}")
    private int salary;

    @Autowired
    private Adress adress;
    @Autowired
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
