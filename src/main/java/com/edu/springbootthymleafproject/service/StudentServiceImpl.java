package com.edu.springbootthymleafproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.springbootthymleafproject.entities.Student;
import com.edu.springbootthymleafproject.repositery.StudentRepositery;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepositery studentRepositery;

	public List<Student> getAllStudents() {
		return studentRepositery.findAll();
	}

	public void createStudent(Student student) {
		studentRepositery.save(student);
	}

	
	public Student saveStudent(Student student) {
		return studentRepositery.save(student);
		
	}

	
	public Student getStudentById(Long id) {
	return	studentRepositery.findById(id).get();
	}

	
	public Student updateStudent(Student student) {
		return studentRepositery.save(student);
	}

	
	public void deleteStudentById(Long id) {
		studentRepositery.deleteById(id);
		
	}

}
