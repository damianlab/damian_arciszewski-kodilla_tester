package com.kodilla.collections.adv.immutable.Exercise.Index;

import java.util.concurrent.CopyOnWriteArrayList;

public class Numbers {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("--Exercise 1--");
        // create object of CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> ArrLis = new CopyOnWriteArrayList<Integer>();
        // add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(67);
        ArrLis.add(100);

        //print CopyOnWriteArrayList
        System.out.println("CopyOnWriteArrayList: " + ArrLis);

        System.out.println("indexOf value: " + ArrLis.indexOf(67));


        System.out.println("--Exercise 2--");

        System.out.println("200 is not present: indexOf value 200 and the result is: " + ArrLis.indexOf(200));

        System.out.println("--Exercise 3--");

        CopyOnWriteArrayList<Integer> numbersLis = new CopyOnWriteArrayList<Integer>();
        // add elements
        numbersLis.add(34);
        numbersLis.add(70);
        numbersLis.add(91);
        numbersLis.add(80);
        numbersLis.add(80);

        for(Integer num : numbersLis) {
            System.out.println(num);
        }
        // first occurance of 67 from 2nd index
        System.out.println("indexOf value: " + numbersLis.indexOf(80, 3));
    }
}
