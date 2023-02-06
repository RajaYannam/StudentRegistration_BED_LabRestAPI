package com.greatlearning.studentmngtsys.service;

import java.util.List;

import com.greatlearning.studentmngtsys.model.Student;

public interface StudentService {
	
	public Student saveRecord(Student student);
	
	//to get list of students in an array//
	public List<Student> getAllStudents();

}
