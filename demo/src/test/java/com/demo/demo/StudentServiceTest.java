package com.demo.demo;


import com.demo.demo.model.Student;
import com.demo.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void testCRUDOperations() {

        StudentService studentService = new StudentService();
        String studentId = "1";
        Student originalStudent = new Student("deepak", 23, 5000.0);
        Student updatedStudent = new Student("aman", 26, 5232.0);


        studentService.addStudent(studentId, originalStudent);
        Student retrievedStudent = studentService.getStudent(studentId);

        assertEquals(originalStudent, retrievedStudent);


        studentService.updateStudent(studentId, updatedStudent);
        retrievedStudent = studentService.getStudent(studentId);


        assertEquals(updatedStudent, retrievedStudent);


        studentService.deleteStudent(studentId);
        retrievedStudent = studentService.getStudent(studentId);

        assertNull(retrievedStudent);
    }
}