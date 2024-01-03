package com.code.service.impl;

import com.code.model.Student;
import com.code.repository.StudentRepository;
import com.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired StudentRepository studentRepository; // chyba przypisanie działa sqlowego typu select *...
    @Override
    public Student getById(int id) {
        Student s = studentRepository.findById(id).orElse(null);
        return s;
    }

    //select * from student where id=wartosc;
    @Override
    public Student getByName(String tytul) {
        Student s = studentRepository.findByTytul(tytul); // dosłownie select * from student where name =
        return s;
    }

    @Override
    public boolean save(Student student) {
       // System.out.println("id-" + student.getId() + ", name-" + student.getName() + ", ,monbileNo- " + student.getMobileNo());
        studentRepository.save(student); // to jest dosłownie insert into()
        return true;
    }
}
