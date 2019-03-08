package _02_ProgramaticTransaction.model;

public class Adress {

    private int adressid;
    private String city;
    private String street;

    public Adress(int adressid, String city, String street) {
        this.adressid = adressid;
        this.city = city;
        this.street = street;
    }

    public int getId() {
        return adressid;
    }

    public void setId(int id) {
        this.adressid = adressid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
