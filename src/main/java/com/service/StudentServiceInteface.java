package com.service;

import java.util.List;

import com.model.Students;

public interface StudentServiceInteface {
	//CRUD Operations
	
	public Students addStudent(Students s);
	
	public Students getOneStudent(int id);
	
	public List<Students> getAllStudents();
	
	public Students updateStudents(Students s);
	
	public void deleteStudents(int id);
	
	
	
	

}
