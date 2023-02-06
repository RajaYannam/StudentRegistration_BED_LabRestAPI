package com.greatlearning.studentmngtsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.studentmngtsys.model.Student;
import com.greatlearning.studentmngtsys.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
@Autowired
StudentService studentservice;

@RequestMapping("/list")
public String listStudents(Model model) {
   List<Student> studentlist = studentservice.getAllStudents();
   model.addAttribute("Students", studentlist);
   return "list_students";
 }

@RequestMapping("/showFormForAdd")
public String showForm(Model model) {
	Student student = new Student();
	model.addAttribute("Student", student);
	 return "student_form";
  }

@PostMapping("/save")
public String saveForm(@RequestParam("id") int id,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName
,@RequestParam("country") String country,@RequestParam("course") String course) {
	Student student = new Student();
	student.setFirstName(firstName);
	student.setLastName(lastName);
	student.setCourse(course);
	student.setCountry(country);
	student.setId(id);
	studentservice.saveRecord(student);
	return "redirect:/student/list";
   }
}
