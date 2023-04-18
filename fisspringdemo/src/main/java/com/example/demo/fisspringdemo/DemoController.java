package com.example.demo.fisspringdemo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class Employee{
	int empid;
	String name;
	String dept;
	public Employee() {
		
	}
	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
@RestController
public class DemoController {
	
	@GetMapping("/test/{name}/{city}")
	public String test(@PathVariable("name") String x,
			@PathVariable("city") String c) {
		
		return "Hello, "+x+" Welcome to"+c;
	}
	
	@GetMapping("/params")
	public String testParams(@RequestParam("ka")String k,
			@RequestParam("ts")String t) {
		return k+" "+t;
	}
	
	
	@GetMapping("/emp1")
	public String getEmp(@RequestBody Employee e) {
		return e.getName()+" Hello welcome to "+e.getDept();
	}
	
	
	@GetMapping("/emp2")
	public Employee getEmp() {
		
		return new Employee(9001,"praveen","finance");
	}
	
	@PostMapping("/post")
	public String post() {
		return "Post Mapping method is called";
	}
	
	@DeleteMapping("/delete")
	public String delets() {
		return "delete mapping is called";
	}
	
	@PutMapping("/put")
	public String put() {
		return "Put method is called";
	}

}
