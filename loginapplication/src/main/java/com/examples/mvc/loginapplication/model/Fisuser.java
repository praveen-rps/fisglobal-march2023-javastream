package com.examples.mvc.loginapplication.model;

public class Fisuser {
	
	String username;
	String password;
	public Fisuser() {
		
	}
	public Fisuser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
