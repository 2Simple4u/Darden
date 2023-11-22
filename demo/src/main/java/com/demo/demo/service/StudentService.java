package com.demo.demo.service;

import com.demo.demo.model.Student;
//import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService {
    Logger logger
            = Logger.getLogger(StudentService.class.getName());

    private Map<String, Student> studentDatabase = new HashMap<>();



    public void addStudent(String studentId, Student student) {

        studentDatabase.put(studentId, student);
        logger.log(Level.INFO, "Data is added");
    }

    public Student getStudent(String studentId) {
        logger.log(Level.INFO, "Data is show");
        return studentDatabase.get(studentId);
    }



    public void updateStudent(String studentId, Student updatedStudent) {
        studentDatabase.put(studentId, updatedStudent);
        logger.log(Level.INFO, "Data is updated");
    }

    public void deleteStudent(String studentId) {
        studentDatabase.remove(studentId);
        logger.log(Level.INFO, "Data is deleted");
    }
}
