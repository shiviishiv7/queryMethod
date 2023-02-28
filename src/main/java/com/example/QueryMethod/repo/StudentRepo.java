package com.example.QueryMethod.repo;

import com.example.QueryMethod.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

//private String firstName;
//private String lastName;
//private Integer age;
//private Date startDate;
//private boolean active;

public interface StudentRepo extends JpaRepository<Student,Integer> {

//    Student findByActiveAndID(boolean active);

    Student findByFirstName(String name);
    List<Student> findByFirstNameOrLastName(String firstName,String lastName);

    List<Student> findByFirstNameAndLastName(String firstName,String lastName);

//    List<Student> findByStartDate(Date date);

    List<Student> findByFirstNameLike(String name);
    List<Student> findByFirstNameLikeAndLastNameLike(String name,String lastName);

    List<Student> findByActive(boolean active);
}
