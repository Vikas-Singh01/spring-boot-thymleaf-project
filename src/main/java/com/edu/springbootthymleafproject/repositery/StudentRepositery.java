package com.edu.springbootthymleafproject.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.springbootthymleafproject.entities.Student;

public interface StudentRepositery  extends JpaRepository<Student, Long>{

}
