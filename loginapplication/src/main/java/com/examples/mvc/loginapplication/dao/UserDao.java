package com.examples.mvc.loginapplication.dao;

import java.util.List;

import com.examples.mvc.loginapplication.model.Fisuser;

public interface UserDao {
	
	public String addUser(Fisuser user);
	public String deleteUser(Fisuser user);
	public Fisuser searchUser(String username);
	public List<Fisuser> getAllUsers();

}
