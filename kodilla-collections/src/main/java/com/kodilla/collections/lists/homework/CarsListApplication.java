package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car fiat = new Fiat();
        cars.add(fiat);
        cars.add(new Opel());
        cars.add(new Ford());

        cars.remove(2);
        cars.remove(fiat);

        System.out.println(cars.size());
        for (Car car : cars) {
            car.increaseSpeed();
            if (car.getSpeed() > 0)
               CarUtils.describeCar(car);
        }
    }
}
