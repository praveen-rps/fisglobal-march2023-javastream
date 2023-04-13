package com.examples.mvc.loginapplication.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.mvc.loginapplication.model.Fisuser;
import com.examples.mvc.loginapplication.model.FisuserRowMapper;
import com.examples.mvc.loginapplication.model.Students;

@Controller
public class HomeController {

	
	@Autowired
	JdbcTemplate template;
	
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

	@RequestMapping("/delete")
	public String deleteData() {
		return "delete";
	}

	@RequestMapping("/search")
	public String searchData() {
		return "search";
	}

	@RequestMapping(value = "/test")
	public ModelAndView test1(HttpServletRequest request) throws IOException {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		String sql ="select * from fisuser";
		List<Fisuser> users = template.query(sql, new FisuserRowMapper());
		
		boolean found =false;
		for(Fisuser usr: users) {
			if (uname.equals(usr.getUsername()) && passwd.equals(usr.getPassword())) {
				found=true;
				break;
			}
		}
		
		if (found)

			return new ModelAndView("success", "user", uname);
		else
			return new ModelAndView("fail");
	}
}
