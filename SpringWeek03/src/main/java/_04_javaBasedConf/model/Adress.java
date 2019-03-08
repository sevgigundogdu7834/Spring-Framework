package _04_javaBasedConf.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.inject.Singleton;

@Component
public class Adress {


    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                '}';
    }
}
