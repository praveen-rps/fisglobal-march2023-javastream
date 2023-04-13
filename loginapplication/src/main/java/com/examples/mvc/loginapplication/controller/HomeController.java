package com.examples.mvc.loginapplication.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.mvc.loginapplication.model.Students;

@Controller
public class HomeController {
	
	@RequestMapping(value="/test2")
	public ModelAndView test2() {
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
	
		ArrayList<Students> data = new ArrayList<>();
		data.add(new Students(1,"praveen"));
		data.add(new Students(2,"kumar"));
		data.add(new Students(3,"sunil"));
		
		
		return new ModelAndView("test2","data",data);
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
		
				return new ModelAndView("success","user",uname);
		else
				return new ModelAndView("fail");
		
	}
}
