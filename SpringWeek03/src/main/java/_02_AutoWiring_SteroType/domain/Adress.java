package _02_AutoWiring_SteroType.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Adress {

    @Value(value = "Ankara")
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
