package com.demo.demo.service;

import com.demo.demo.model.Student;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class StudentService {


    private Map<String, Student> studentDatabase = new HashMap<>();



    public void addStudent(String studentId, Student student) {

        studentDatabase.put(studentId, student);
    }

    public Student getStudent(String studentId) {
        return studentDatabase.get(studentId);
    }

    public void updateStudent(String studentId, Student updatedStudent) {
        studentDatabase.put(studentId, updatedStudent);
    }

    public void deleteStudent(String studentId) {
        studentDatabase.remove(studentId);
    }
}
