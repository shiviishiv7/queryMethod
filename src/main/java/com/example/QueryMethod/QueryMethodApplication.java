package com.example.QueryMethod;

import com.example.QueryMethod.model.Student;
import com.example.QueryMethod.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class QueryMethodApplication implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(QueryMethodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setActive(true);
		student.setFirstName("rahul");
		student.setLastName("kumar");
		student.setAge(24);
//		student.setStartDate(new Date(""));
		studentRepo.save(student);

		 student = new Student();
		student.setActive(true);
		student.setFirstName("sid");
		student.setLastName("sharma");
		student.setAge(26);
		studentRepo.save(student);

	}
}
