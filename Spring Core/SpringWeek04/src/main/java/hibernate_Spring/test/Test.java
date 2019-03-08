package hibernate_Spring.test;

import hibernate_Spring.model.Student;
import hibernate_Spring.repository.StudentRepoIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/resources/hibernateSpring.xml");
       StudentRepoIml studentRepoIml= context.getBean(StudentRepoIml.class);

        Student student=new Student();
        student.setName("Demir");
        student.setSurname("Aktaş");
        student.setSalary(2300);

       studentRepoIml.insertStudent(student);
    }
}
