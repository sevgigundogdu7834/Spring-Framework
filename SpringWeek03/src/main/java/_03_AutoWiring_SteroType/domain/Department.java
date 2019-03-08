package _03_AutoWiring_SteroType.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "configure.properties")
public class Department {

    @Value(value = "${departmentName}")
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
