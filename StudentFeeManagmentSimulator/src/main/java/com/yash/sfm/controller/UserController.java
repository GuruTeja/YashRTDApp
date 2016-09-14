package com.yash.sfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.sfm.model.User;
import com.yash.sfm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String showLoginForm(){
		return "loginpage";
	}
	
	@RequestMapping("/processLogin")
	public String processLogin(@ModelAttribute("user") User user){
		
		User userLoggedin = userService.authenticateUser(user);
		
		if(userLoggedin != null){
			return "redirect:/student/homepage.htm";
		}
		return null;
	}
	
}
