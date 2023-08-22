package com.example.jpademo.controller;

import com.example.jpademo.model.Student;
import com.example.jpademo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
       List<Student> list = studentRepo.findAll();

       return list;
    }
}
