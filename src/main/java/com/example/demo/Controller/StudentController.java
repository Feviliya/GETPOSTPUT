package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.StudentDemo;

@RestController
public class StudentController {
	@Autowired
	StudentService stuSer;
	
	@PostMapping("/addDetails")
	public StudentDemo addInfo( @RequestBody StudentDemo st) {
		return stuSer.saveDetails(st);
	}
	
	@GetMapping("/showDetails")
	public List<StudentDemo> fetchDetails(){
		return stuSer.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public StudentDemo updateInfo(@RequestBody StudentDemo st1) {
		return stuSer.updateDetails(st1);
	}
}
