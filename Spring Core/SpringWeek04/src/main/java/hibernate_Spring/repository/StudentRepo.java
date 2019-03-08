package hibernate_Spring.repository;

import hibernate_Spring.model.Student;
import java.util.List;

public interface StudentRepo {

    public void insertStudent(Student student);
    public void findById(int id);
    public List<Student> studentList();
    public void updateStudent(Student student);
    public void deleteStudent(int id);

}
