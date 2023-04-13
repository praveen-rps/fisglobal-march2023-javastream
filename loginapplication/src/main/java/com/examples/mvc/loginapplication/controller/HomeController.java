package com.examples.mvc.loginapplication.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/test2")
	public String test2() {
		return "test2";
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/add")
	public String addData() {
		return "add";
	}

	@RequestMapping("/delete")
	public String deleteData() {
		return "delete";
	}

	@RequestMapping("/search")
	public String searchData() {
		return "search";
	}
	
	@RequestMapping(value="/test")
	public ModelAndView test1(HttpServletRequest request) throws IOException{
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		if(uname.equals("admin") && passwd.equals("admin"))
		
				return new ModelAndView("success");
		else
				return new ModelAndView("fail");
		
	}
}
