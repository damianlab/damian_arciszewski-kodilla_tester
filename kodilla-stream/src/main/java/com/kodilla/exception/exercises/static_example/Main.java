package com.kodilla.exception.exercises.static_example;

public class Main {

    public static void main(String[] args) {
//        sampleMethod(); tak sie nie da
    }

    public void sampleMethod() {
        Math math = new Math();
        System.out.println(math.add(1, 4));
        System.out.println(math.PI);

        System.out.println(Math.PI);
        Math.somethingStatic();
    }

}
