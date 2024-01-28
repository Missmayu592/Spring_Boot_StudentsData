package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Students;
import com.service.StudentServiceInteface;

@RestController
public class StudentsController {
	
	
	@Autowired
	StudentServiceInteface studService;
	
	
	@PostMapping("/addStudent")
	public Students addStudents(@RequestBody Students s) {
		return studService.addStudent(s);
	}
	
	@GetMapping("/getOne{id}")
	public Students getOneStudents(@PathVariable("id") int id) {
		return studService.getOneStudent(id);
	}
	
	@GetMapping("/getAll")
	public List<Students> getAllStudents(){
		return studService.getAllStudents();
	}
	
	@PutMapping("/updateStudents")
	public Students updateStudents(@RequestBody Students s) {
		return studService.updateStudents(s);
	}
	
	
	@DeleteMapping("/delete{id}")
	public void deleteStudents(@PathVariable("id") int id) {
		studService.deleteStudents(id);
	}
	
	

}
