package com.edu.springbootthymleafproject.service;

import java.util.List;

import com.edu.springbootthymleafproject.entities.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public void createStudent(Student student);
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
