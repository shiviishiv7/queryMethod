package com.example.QueryMethod.controller;


import com.example.QueryMethod.model.Student;
import com.example.QueryMethod.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping
  public   List<Student> findAllStudentWhoAreActive(){
       return studentService.findAllStudent();
    }
    @GetMapping("/name")
    public   List<Student> findByFirstNameAndLastName(@RequestParam(value = "firstName",required = true)String firstName, @RequestParam(value = "lastName",required = true)
                                                      String lastName){

        return studentService.findByFirstNameAndLastName(firstName,lastName);
    }


}
