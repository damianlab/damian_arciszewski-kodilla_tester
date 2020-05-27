package com.kodilla.collections.adv.immutable.Exercise.Association;

import java.util.ArrayList;
import java.util.List;

public class GFG {
    public static void main(String[] args) {
        Student s1 = new Student("Mai",1, "CSE");
        Student s2 = new Student("Aga",2, "CSE");
        Student s3 = new Student("Seba",1, "CE");
        Student s4 = new Student("Tomek",2, "CE");

        List<Student> cseStudents = new ArrayList<Student>();
        cseStudents.add(s1);
        cseStudents.add(s2);

        // making a List of
        // EE Students
        List<Student> ceStudents = new ArrayList<Student>();
        ceStudents.add(s3);
        ceStudents.add(s4);

        Department CSE = new Department("CSE", cseStudents);
        Department CE = new Department("CE", ceStudents);

        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(CE);

// creating an instance of Institute.
        Institute institute = new Institute("BITS", departments);

        System.out.println("Total students in institute: ");
        System.out.println(institute.getTotalStudentInInstitute());

        for(Student pas : ceStudents) {
            System.out.println("Student of CE: " + pas);

        }



      }
}
