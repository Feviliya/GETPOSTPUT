package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.entity.StudentDemo;
@Service
public class StudentService {
	@Autowired
	StudentRepo stRepo;
	public StudentDemo saveDetails(StudentDemo e) {
		return stRepo.save(e);
	}
	
	public List<StudentDemo> getDetails(){
		return stRepo.findAll();	//to retrieve values		
	}
	
	public StudentDemo updateDetails(StudentDemo sd) {
		return stRepo.saveAndFlush(sd);
	}
}


//businness logic