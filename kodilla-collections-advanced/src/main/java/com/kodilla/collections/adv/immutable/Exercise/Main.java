package com.kodilla.collections.adv.immutable.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                List<Car> cars = new ArrayList<>();
                // Set<Car> cars = new HashSet<>();
                // Adding new elements to the HashSet
                cars.add(new Car("Ford", "White"));
                cars.add(new Car("Opel", "Black"));
                cars.add(new Car("Opel", "White"));
                cars.add(new Car("Audi", "Red"));

                CarManager carManager = new CarManager();
                //carManager.createCar("Fiat", "Orange");
                //carManager.createCar("Opel", "BlackBlack");


                //List<Car> cars2 = new ArrayList<>();
                //Set<Car> cars2 = new HashSet<>();
                //cars2.add(new Car("Opel", "Yellow"));

                List<Car> cars23 = new ArrayList<>(cars);
                //Set<Car> cars23 = new HashSet<>(cars);
                cars23.add(carManager.createCar("Wojtek", "Orange"));
                cars23.add(carManager.createCar("Wiktor", "Black"));
                cars23.add(carManager.createCar("Audi", "Red"));
                cars23.add(carManager.createCar("Audi", "Red"));

        //System.out.println(cars23);

                System.out.println(cars23.size());
                for(Car car : cars23)
                    System.out.println(car);

                //List<Car> cars234 = new ArrayList<>(cars);
                //cars234.addAll(cars2);
                //cars234.add(3, new Car("Pontiac", "Gray"));
               // System.out.println("Cars234: " + cars234);

               // String a = "Ford";
                //String b = "White";
               // if(cars.contains(new Car(a, b))) {
              //      System.out.println(a + " is in the objects set.");
              //  } else {
             //       System.out.println(a + " is not in the objects set.");
             //   }

            }
        }

