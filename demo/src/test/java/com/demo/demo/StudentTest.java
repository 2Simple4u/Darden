package com.demo.demo;


import com.demo.demo.model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testSetName() {
        Student student = new Student("Deepak",11,2000.33);
        String newName = "A";

        student.setName(newName);

        assertEquals(newName,student.getName());
    }

    @Test
    public void testSetAge() {
        Student student = new Student("Deepak",11,2000.33);
        Integer newAge = 15;


        student.setAge(newAge);

        assertEquals(newAge,student.getAge());
    }

    @Test
    public void testSetSalary() {
        Student student = new Student("Deepak",11,2000.33);
        Double newSalary = 3000.00;

        student.setSalary(newSalary);

        assertEquals(newSalary,student.getSalary());
    }

}
