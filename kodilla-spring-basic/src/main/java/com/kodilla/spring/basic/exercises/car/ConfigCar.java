package com.kodilla.spring.basic.exercises.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class ConfigCar {

    @Bean
    @Scope("prototype")
    public Car returnCarDependingOnTheSeason(Season season, LocalTime time) {
        switch (season) {
            case SUMMER: return new Cabrio(time);
            case WINTER: return new SUV(time);
            case AUTUMN:
            case SPRING:
                return new Sedan(time);
        }

        return null;
    }


}
