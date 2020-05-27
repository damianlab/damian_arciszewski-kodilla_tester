package com.kodilla.collections.adv.immutable.Exercise.Association;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private String dept;

    public Student(String name, int id, String dept) {
        this.name =name;
        this.id = id;
        this.dept = dept;


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(dept, student.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dept);
    }
}
