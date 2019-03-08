package _02_ProgramaticTransaction.repository;

import _02_ProgramaticTransaction.model.Adress;
import _02_ProgramaticTransaction.model.Person;

public interface RepoInt {

    public void insertPerson(Person person);
    public void insertAdress(Adress adress);
    public void updatePersonAdress(int id,int adressId);
}
