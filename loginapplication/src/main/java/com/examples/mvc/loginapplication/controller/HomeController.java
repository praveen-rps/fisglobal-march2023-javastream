package com.examples.mvc.loginapplication.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.mvc.loginapplication.model.Fisuser;
import com.examples.mvc.loginapplication.model.Students;
import com.examples.mvc.loginapplication.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService service;

	@RequestMapping(value = "/test2")
	public ModelAndView test2() {

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");

		ArrayList<Students> data = new ArrayList<>();
		data.add(new Students(1, "praveen"));
		data.add(new Students(2, "kumar"));
		data.add(new Students(3, "sunil"));

		return new ModelAndView("test2", "data", data);
	}

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping("/add")
	public String addData() {
		return "add";
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(HttpServletRequest request) throws IOException {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		Fisuser user = new Fisuser(uname, passwd);
		service.addUser(user);

		return new ModelAndView("success");
	}

	@RequestMapping("/delete")
	public String deleteData() {
		return "delete";
	}

	@RequestMapping("/search")
	public String searchData() {
		return "search";
	}

	@RequestMapping("/searchuser")
	public ModelAndView searchuser(HttpServletRequest request) {
		String uname = request.getParameter("lid");
		Fisuser user = service.searchUser(uname);
		return new ModelAndView("displayuser","user",user);
	}

	@RequestMapping(value = "/test")
	public ModelAndView test1(HttpServletRequest request) throws IOException {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		List<Fisuser> users = service.getAllUsers();

		boolean found = false;
		for (Fisuser usr : users) {
			if (uname.equals(usr.getUsername()) && passwd.equals(usr.getPassword())) {
				found = true;
				break;
			}
		}

		if (found)

			return new ModelAndView("success", "user", uname);
		else
			return new ModelAndView("fail");
	}
}
