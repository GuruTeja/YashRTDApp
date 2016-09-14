package com.yash.sfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.sfm.model.Student;
import com.yash.sfm.service.StudentService;
import com.yash.sfm.service.UserService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/homepage")
	public String homePage(Model model){
		getStudentsList(model);
		return "homepage";
	}
	
	private void getStudentsList(Model model) {
		model.addAttribute("studentList", studentService.getStudentList());
	}
	
	@RequestMapping("/viewStudentDetails")
	public String viewUserDetails(@ModelAttribute("student") Student student){
		System.out.println("in viewStudentDetailas");
		System.out.println(student.getFirstname());
		System.out.println(student.getId());
		//get details for the selected student
		getRegisterdStudentCoursesAndFeeDetails();
		return "studentDetailsHomePage";
	}

	private void getRegisterdStudentCoursesAndFeeDetails() {
		////studentService
	}

	@RequestMapping("/freesearch")
	public String freeSearch(){
	return "null";	
	}
	
	@RequestMapping("/viewCourses")
	public String viewCourses(){
		return null;
	}
	
	@RequestMapping("/addCourses")
	public String addCourses(){
		return null;
	}
}
