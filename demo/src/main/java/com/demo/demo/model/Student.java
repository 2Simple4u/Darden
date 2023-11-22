package com.demo.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Student {
   public String name ;
   public Integer age;
   public Double salary;

   public Student(String name, Integer age, Double salary) {
      this.name = name;
      this.age = age;
      this.salary = salary;
   }
}
