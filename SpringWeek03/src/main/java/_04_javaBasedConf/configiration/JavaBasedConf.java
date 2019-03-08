package _04_javaBasedConf.configiration;

import _04_javaBasedConf.model.Adress;
import _04_javaBasedConf.model.Department;
import _04_javaBasedConf.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "configure1.properties")
@ComponentScan(basePackages = "_04_javaBasedConf.model")
public class JavaBasedConf {

    @Autowired
    private Environment environment;

    @Bean
    public Person person(){

        String name=environment.getProperty("name");
        String surname=environment.getProperty("surname");
        int salary=Integer.parseInt(environment.getProperty("salary"));

        Person person=new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setSalary(salary);

        return person;
    }

    @Value(value = "${departmentName}")
    private String department_Name;

    @Bean
    public Department department(){

        Department department=new Department();
        department.setDepartment_Name(department_Name);
        return department;

    }

    @Bean
    public Adress adress(){

        String city=environment.getProperty("city");
        Adress adress=new Adress();
        adress.setCity(city);

        return adress;
    }
}
