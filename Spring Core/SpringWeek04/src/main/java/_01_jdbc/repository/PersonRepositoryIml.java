package _01_jdbc.repository;

import _01_jdbc.model.Person;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryIml implements PersonRepository {
    private final String İNSERT_PERSON = "insert into person(id,name,surname,birthyear) values(?,?,?,?) ";
    private final String SELECT_PERSON = "select * from person where id=?";
    private final String ALL_PERSON = "select * from person";
    private final String UPDATE_PERSON= "update person set name= ? , surname=? , birthyear=? where id=?";
    private final String DELETE_PERSON= "delete from person where id=?";
    private final String ALL_DELETE_PERSON= "delete from person ";

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertPerson(Person person) {

        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(İNSERT_PERSON);
            preparedStatement.setInt(1, person.getId());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setString(3, person.getSurname());
            preparedStatement.setInt(4, person.getBirthYear());
            preparedStatement.executeUpdate();
            connection.close();

            System.out.println("Inserting personn.....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findById(int id) {

        try {
            Connection connection = dataSource.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PERSON);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int year = resultSet.getInt("birthyear");

                Person person = new Person(id, name, surname, year);

                System.out.println(person);

            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> allPerson() {

        List<Person> personList = new ArrayList<Person>();

        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ALL_PERSON);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int year = resultSet.getInt("birthyear");

                Person person = new Person(id, name, surname, year);
                personList.add(person);

            }


            System.out.println(personList);


        } catch (SQLException e) {
            e.printStackTrace();
        }

return personList;

    }

    public void updatePerson(Person person) {

        try {
            Connection connection=dataSource.getConnection();
           PreparedStatement preparedStatement= connection.prepareStatement(UPDATE_PERSON);
           preparedStatement.setString(1,person.getName());
           preparedStatement.setString(2,person.getSurname());
           preparedStatement.setInt(3,person.getBirthYear());

           preparedStatement.setInt(4,person.getId());

           preparedStatement.executeUpdate();
           preparedStatement.close();

            System.out.println("Updating Person" + person);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePerson(Person person) {

        try {
            Connection connection=dataSource.getConnection();
          PreparedStatement preparedStatement=  connection.prepareStatement(DELETE_PERSON);
          preparedStatement.setInt(1,person.getId());
          preparedStatement.executeUpdate();

          preparedStatement.close();

            System.out.println("Deleting person...."+person);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alldeletePerson(Person person) {

        try {
            Connection connection=dataSource.getConnection();
           PreparedStatement preparedStatement= connection.prepareStatement(ALL_DELETE_PERSON);
           preparedStatement.executeUpdate();

           preparedStatement.close();

            System.out.println("deleting all person " +person);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}