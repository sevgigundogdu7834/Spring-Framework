package _03_JSR330.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class Department {

    @Value(value = "It")
    private String department_Name;

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_Name='" + department_Name + '\'' +
                '}';
    }
}
