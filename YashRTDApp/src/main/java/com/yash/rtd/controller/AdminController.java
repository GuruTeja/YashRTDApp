package com.yash.rtd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yash.rtd.model.User;

@Controller
@RequestMapping("/admin")
public class AdminController {
	User loggedInUser;
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam("search") String search,HttpSession session){
		loggedInUser = (User) session.getAttribute("loggedInUser");
		ModelAndView mav = null;
		if(loggedInUser == null){
			mav = new ModelAndView("redirect:/index.jsp");
		}
		else{
			System.out.println("in admin admin/Search: is "+search);
			mav = new ModelAndView("searchpage");
		}
		return mav;
	}
	
	@RequestMapping("/listusers")
	public ModelAndView listUsers(HttpSession session){
		System.out.println("In listusers");
		loggedInUser = (User) session.getAttribute("loggedInUser");
		ModelAndView mav = null;
		if(loggedInUser == null){
			mav = new ModelAndView("redirect:/index.jsp");
		}
		else{
			mav = new ModelAndView("user/admin/viewUserDashboardpage");
		}
		return mav;
	}
	@RequestMapping("/locationhomepage")
	public ModelAndView locationhomepage(HttpSession session){
		System.out.println("in location home page");
		loggedInUser = (User) session.getAttribute("loggedInUser");
		ModelAndView mav = null;
		if(loggedInUser == null){
			mav = new ModelAndView("redirect:/index.jsp");
		}
		else{
			mav = new ModelAndView("user/admin/locationhomepage");
		}
		return mav;
	}
	
	@RequestMapping("/adminDashBoardpage")
	public String redirectToAdminDashBoardPage(HttpSession session){
		User loggedInUser = (User) session.getAttribute("loggedInUser");
		if(loggedInUser == null){
			return "redirect:/index.jsp";
		}
		else{
			return "user/admin/adminDashBoardpage";
		}
	}
}
