package com.code.controller;

import com.code.model.Student;
import com.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/student") // jeśli będzie /student w linku to przemieli ten controller
//pierw /student potem slashe po studencie
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/id") // wszelkie GETy w /id będą przemielane przez returna dla tego contorllera
    public Student getById(@RequestParam(value = "id", defaultValue = "1") int id){
        return studentService.getById(id);
    }

// służy to do poruszaniu się po link/url
    @RequestMapping(value = "/tytul", method = RequestMethod.GET) // najbardziej zalecana metoda ze względu na to że nie trzeba z automatu definiować tylko w method =
    public Student getByName(@RequestParam(value = "tytul", defaultValue = "Interion")String tytul){
        return studentService.getByName(tytul);
    }
// na filmiku 19:17 jest więcej skrótów
    @PostMapping("/save") // creating database with post mapping
    public boolean saveStudent(@RequestBody(required = true) Student student) {
        return studentService.save(student);
    }
}

