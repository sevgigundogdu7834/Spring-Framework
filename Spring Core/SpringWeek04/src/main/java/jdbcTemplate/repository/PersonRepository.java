package jdbcTemplate.repository;

import _01_jdbc.model.Person;

import java.util.List;

public interface PersonRepository {

    public void insertPerson(Person person);
    public void findById(int id);
    public List<jdbcTemplate.model.Person> allPerson();
    public void  updatePerson(Person person);
    public void  deletePerson(Person person);
    public void  alldeletePerson(Person person);
}
