package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Fiat> cars = new ArrayList<>(); // nazwa zmiennej cars
        Fiat fiat = new Fiat();
        cars.add(fiat);
        cars.add(new Fiat());
        cars.add(new Fiat());

   //     for (Fiat car : cars) {
   //         car.increaseSpeed();
   //     CarUtils.describeCar(car);
   // }

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
