package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Students;

public interface StudentRepository extends JpaRepository<Students, Integer>{

}
