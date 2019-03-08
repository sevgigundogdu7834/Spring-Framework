package _03_JSR330.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class Adress {

    @Value("İstanbul")
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
