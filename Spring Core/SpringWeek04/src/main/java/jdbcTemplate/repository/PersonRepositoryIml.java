package jdbcTemplate.repository;

import jdbcTemplate.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PersonRepositoryIml implements PersonRepository{

  private JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertPerson(_01_jdbc.model.Person person) {


    }

    public void findById(int id) {

    }

    public List<Person> allPerson() {
        return null;
    }

    public void updatePerson(_01_jdbc.model.Person person) {

    }

    public void deletePerson(_01_jdbc.model.Person person) {

    }

    public void alldeletePerson(_01_jdbc.model.Person person) {

    }
}
