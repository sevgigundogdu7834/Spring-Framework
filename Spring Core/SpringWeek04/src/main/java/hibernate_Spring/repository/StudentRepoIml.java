package hibernate_Spring.repository;

import _01_jdbc.model.Person;
import hibernate_Spring.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class StudentRepoIml implements StudentRepo {

  private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){

        return sessionFactory.openSession();

    }

    @Override
    public void insertStudent(Student student) {
        Session session=getSession();
        Transaction transaction=session.getTransaction();
        transaction.begin();
        session.persist(student);
        transaction.commit();

    }

    @Override
    public void findById(int id) {

        Session session=getSession();
        session.find(Student.class,id);

    }

    @Override
    public List<Student> studentList() {
        Session session=getSession();
        TypedQuery<Student> query=session.createQuery("Select s from Student s",Student.class);
        return query.getResultList();


    }

    @Override
    public void updateStudent(Student student) {

        Session session=getSession();
        session.getTransaction().begin();
        session.persist(student);
        session.getTransaction().commit();

    }

    @Override
    public void deleteStudent(int id) {

        Session session=getSession();
        session.getTransaction().begin();
        Student studentFind=session.find(Student.class,id);

        if(studentFind!=null){
            session.delete(studentFind);
        }
        session.getTransaction().commit();

    }
}
