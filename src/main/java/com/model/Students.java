package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String fullName;
	private int age;
	private String email;
	
	public Students() {
		super();
		
	}
	public Students(int id, String fullName, int age, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Students id=" + id + ", fullName=" + fullName + ", age=" + age + ", email=" + email;
	}
	
	
	

	

}
