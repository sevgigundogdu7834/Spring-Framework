package _02_AutoWiring_SteroType.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Department {

   @Value(value = "IT")
    private String departmnet_Name;

    public String getDepartmnet_Name() {
        return departmnet_Name;
    }

    public void setDepartmnet_Name(String departmnet_Name) {
        this.departmnet_Name = departmnet_Name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmnet_Name='" + departmnet_Name + '\'' +
                '}';
    }
}
