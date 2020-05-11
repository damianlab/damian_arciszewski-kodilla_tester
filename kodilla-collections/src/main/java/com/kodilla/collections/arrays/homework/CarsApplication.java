package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;
public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for(int n=0; n< cars.length; n++)
            cars[n] = drawCar();
        for(Car car : cars) // konstrukcja, wykona pewną operację dla każdego elementu tablicy cars
CarUtils.describeCar(car);
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        if(drawnCarKind == 0)
            return new Fiat();
        else if(drawnCarKind == 1)
            return new Ford();
        else
            return new Opel();

    }

}
