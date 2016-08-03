package com.yash.rtd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam("search") String search){
		System.out.println("in admin admin/Search: is "+search);
		return null;
	}
	
	@RequestMapping("/listUsers")
	public ModelAndView listUsers(){
		return null;
	}
	@RequestMapping("/locationhomepage")
	public ModelAndView locationhomepage(){
		System.out.println("in location home page");
		return null;
	}
	
}
