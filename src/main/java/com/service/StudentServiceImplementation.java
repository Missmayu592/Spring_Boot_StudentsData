package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Students;

@Service
public class StudentServiceImplementation implements StudentServiceInteface{
	
	@Autowired
	StudentRepository studRepo;

	
	public Students addStudent(Students s) {
		
		return studRepo.save(s);
	}

	
	public Students getOneStudent(int id) {
		
		return studRepo.findById(id).orElse(null);
	}

	
	public List<Students> getAllStudents() {
		
		return studRepo.findAll();
	}

	
	public Students updateStudents(Students s) {
		Students newStudents = studRepo.findById(s.getId()).orElse(null);
		newStudents.setFullName(s.getFullName());
		return studRepo.save(newStudents);
	}

	
	public void deleteStudents(int id) {
		
		studRepo.deleteById(id);;
		
	}

}
