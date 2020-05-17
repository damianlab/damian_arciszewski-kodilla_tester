package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
Map<Principal, School> schoolDirector = new HashMap<>();
Principal john = new Principal("John", "Stevenson");
Principal jessie = new Principal("Jessie", "Pinkman");
Principal bart = new Principal("Bart", "Simpson");

School johnSchool = new School("School of English", 20, 30, 25);
School jessieSchool = new School("Kensington Primary School", 12, 16, 33, 15);
School bartSchool = new School("Lister Infants School", 16, 18, 20);

        schoolDirector.put(john, johnSchool);
        schoolDirector.put(jessie, jessieSchool);
        schoolDirector.put(bart, bartSchool);

        System.out.println(schoolDirector.get(john));
        for(Map.Entry<Principal, School> principalEntry :schoolDirector.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " is a principal of " + principalEntry.getValue().getSchoolName() + " with " + principalEntry.getValue().getSum() + " students");

    }
}





