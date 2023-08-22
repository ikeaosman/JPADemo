package com.example.jpademo.config;

import com.example.jpademo.model.Student;
import com.example.jpademo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepo studentRepo;


    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Sigurd");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        s1.setBornTime(LocalTime.of(23, 59, 59));

        studentRepo.save(s1);
    }
}
