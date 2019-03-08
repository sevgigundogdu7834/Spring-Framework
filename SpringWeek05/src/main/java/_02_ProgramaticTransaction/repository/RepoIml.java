package _02_ProgramaticTransaction.repository;

import _02_ProgramaticTransaction.model.Adress;
import _02_ProgramaticTransaction.model.Person;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class RepoIml implements RepoInt {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private PlatformTransactionManager platformTransactionManager;

    private final String INSERT_PERSON="insert into Person(id,name,surname,salary) values (:id,:name,:surname,:salary)";
    private final String INSERT_ADRESS="insert into Adress(adressid,city,street) values (:adressid,:city,:street)";
    private final String SET_PERSON_ADDRESS="update Person set adressid=:adressid where id=:id";


    public void setNamedParameterJdbcTemplate(DataSource dataSource) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public void setPlatformTransactionManager(PlatformTransactionManager transactionManager) {
        this.platformTransactionManager = transactionManager;
    }

    private TransactionStatus getTransactionStatus() {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus status = platformTransactionManager.getTransaction(transactionDefinition);
        return status;
    }

    public void insertPerson(Person person) {

        TransactionStatus transactionStatus=getTransactionStatus();
        Map<String,Object> params=new HashMap<String, Object>();
        params.put("id",person.getId());
        params.put("name",person.getName());
        params.put("surname",person.getSurname());
        params.put("salary",person.getSalary());

        try{

            namedParameterJdbcTemplate.update(INSERT_PERSON,params);
            System.out.println("Person is inserting..." +person);

            insertAdress(person.getAdress());
            updatePersonAdress(person.getId(),person.getAdress().getId());

            platformTransactionManager.commit(transactionStatus);

        }
        catch (Exception e){

            System.out.println(e.getMessage());
            System.out.println("rollback...");
            platformTransactionManager.rollback(transactionStatus);
        }


    }

    public void insertAdress(Adress adress) {

        Map<String,Object> params=new HashMap<String, Object>();
        params.put("adressid",adress.getId());
        params.put("city",adress.getCity());
        params.put("street",adress.getStreet());
        namedParameterJdbcTemplate.update(INSERT_ADRESS,params);
        System.out.println("Adress is inserting..." +params);

    }

    public void updatePersonAdress(int id, int adressId) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        params.put("addressId", adressId);
        namedParameterJdbcTemplate.update(SET_PERSON_ADDRESS, params);

    }
}
