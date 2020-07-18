package com.kodilla.soap.repository;

import com.kodilla.courses.soap.Course;
import com.kodilla.courses.soap.Technology;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CoursesRepositoryTestSuite {

    @Autowired
    CoursesRepository coursesRepository;

    @Test
    public void shouldFindCourse (){
        Course course = coursesRepository.findCourse("Java Developer");

        assertEquals(6, course.getLength());
        assertEquals(Technology.JAVA, course.getTechnology());
    }


}