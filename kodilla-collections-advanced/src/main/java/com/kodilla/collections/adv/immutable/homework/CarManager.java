package com.kodilla.collections.adv.immutable.homework;

import com.kodilla.collections.adv.immutable.homework.Main;
import java.util.*;

public class CarManager {

    private Set<Car> carpark;
    //private Main cars;


public CarManager() {
    //this.carpark = new ArrayList<>();
    this.carpark = new HashSet<>();
}

    public Car createCar(String a, String b) {
        Car car = new Car(a, b);
        if(!carpark.contains(car)) {
        carpark.add(car);
        return car;
    }
        for (Car car1 : carpark) {
        if (car1.equals(car))  {
            return car1;
        }
    }
        return null;
}
}
