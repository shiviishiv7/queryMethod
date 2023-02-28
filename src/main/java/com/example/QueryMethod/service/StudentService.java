package com.example.QueryMethod.service;


import com.example.QueryMethod.model.Student;
import com.example.QueryMethod.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepo studentRepo;


    Student findByFirstName(String name){
        Student byFirsName = studentRepo.findByFirstName(name);
        return byFirsName;
    }


//    List<Student> getStudentByAddmission(Date date){
//     return    studentRepo.findByStartDate(date);
//    }


   public List<Student>  findAllStudent(){

        return studentRepo.findByActive(true);
    }


    public List<Student> findByFirstNameLike(String name) {
        return studentRepo.findByFirstNameLike(name);
    }

    public List<Student> findByFirstNameAndLastName(String firstName, String lastName) {
        return studentRepo.findByFirstNameOrLastName(firstName,lastName);
    }
}
