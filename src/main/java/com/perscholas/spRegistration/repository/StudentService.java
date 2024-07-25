package com.perscholas.spRegistration.repository;

import com.perscholas.spRegistration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;


    public void save(Student student) {
        repository.save(student);
    }
}