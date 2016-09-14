package com.yash.rtd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yash.rtd.model.User;
import com.yash.rtd.service.UserService;

@Controller
//@SessionAttributes({"loggedInUser"})
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	User loggedInUser = new User();
	
	@RequestMapping("/login")
	public ModelAndView login(){
		System.out.println("in Login controller");
		ModelAndView mav = new ModelAndView("user/loginpage");
		return mav;
	}
	
	@RequestMapping("/registration")
	public ModelAndView register(){
		System.out.println("in register controller");
		ModelAndView mav = new ModelAndView("user/registrationpage");
		return mav;
	}
	
	@RequestMapping("/authenticateUser")
	public ModelAndView authenticateUser(@RequestParam("email") String email,@RequestParam("password") String password,HttpServletRequest req){
		System.out.println("in authenticateUser controller");
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		loggedInUser=userService.authenticateUser(user);
		System.out.println("loggedInUser: "+loggedInUser);
		if(loggedInUser != null){
			if(loggedInUser.getFk_role_id()==1){
				ModelAndView mav = new ModelAndView("redirect:/admin/adminDashBoardpage.htm"); //user/admin/adminDashBoardpage"
				mav.addObject("loggedInUser", loggedInUser);
				req.getSession().setAttribute("loggedInUser",loggedInUser);
				return mav;
			}
		}
		else{
			ModelAndView mav = new ModelAndView("redirect:/index.jsp");
			return mav;
		}
		
		return null;
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute("user") User user){
		System.out.println("in registerUser");
		System.out.println("CompanyLocation: "+user.getCompanyLocations().getLocation_name());
		System.out.println("firstname: "+user.getFirstname());
		System.out.println("lastname: "+user.getLastname());
		System.out.println("dob: "+user.getDob());
		System.out.println("contact: "+user.getContact());
		System.out.println("doj: "+user.getDoj());
		System.out.println("*******Address**********");
		System.out.println("Street: "+user.getAddress().getStreet());
		System.out.println("City: "+user.getAddress().getCity());
		System.out.println("State: "+user.getAddress().getState());
		System.out.println("Country: "+user.getAddress().getCountry().getCountry_name());
		System.out.println("Email: "+user.getEmail());
		System.out.println("Country: "+user.getPassword());
		userService.registerUser(user);
		return null;
	}

	@RequestMapping("/logout")
	public String logoutUser(HttpSession session){
		session.setAttribute("loggedInUser", null); //session to null
		return "redirect:/index.jsp";
	}
}
