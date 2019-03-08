package ormSpring2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import orm_Spring.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeRepoIml implements EmployeeRepo {


    private EntityManager entityManager;

    @Autowired
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        entityManager = entityManagerFactory.createEntityManager();
    }


    public void saveEmployee(Employee employee) {

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

    }

    public Employee findById(int id) {

       return entityManager.find(Employee.class,id);

    }

    public List<Employee> allEmployee() {

        Query query=entityManager.createQuery("Select e from Employee e");
       List<Employee> employeeList= query.getResultList();
       return employeeList;
    }

    public void updateEmployee(Employee employee) {

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        System.out.println(allEmployee());
    }

    public void deleteEmployee(int id) {

        entityManager.getTransaction().begin();
       Employee foundEmployee= entityManager.find(Employee.class,id);

       if(foundEmployee!=null){

           entityManager.remove(foundEmployee);
       }
        entityManager.getTransaction().commit();
    }
}
