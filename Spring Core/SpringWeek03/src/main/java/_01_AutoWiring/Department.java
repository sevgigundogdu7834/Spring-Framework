package _01_AutoWiring;

public class Department {

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
