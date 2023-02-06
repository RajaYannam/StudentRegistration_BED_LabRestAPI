package com.greatlearning.studentmngtsys.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.studentmngtsys.model.Student;
import com.greatlearning.studentmngtsys.repository.StudentRepository;
import com.greatlearning.studentmngtsys.service.StudentService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

private final StudentRepository studentRepo;

//@Override
//public Student saveRecord(Student student) {
//	return studentRepo.save(student);
	//}

@Override
public List<Student> getAllStudents() {
	return studentRepo.findAll();
}

@Override
public Student saveRecord(Student student) {
	return studentRepo.save(student);
}

}
