package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Vehicle car(){

        return new Car();
    }

    @Bean
    public Wheel lassa(){

        Wheel wheel=new Lassa();
        car().setWheel(wheel);
        return wheel;
    }
}
