package com.examples.mvc.loginapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.mvc.loginapplication.dao.UserDao;
import com.examples.mvc.loginapplication.model.Fisuser;


@Service
public class UserServiceImpl implements UserService {
	
	
	
	
	@Autowired
	UserDao dao;

	@Override
	public String addUser(Fisuser user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public String deleteUser(Fisuser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fisuser searchUser(String username) {
		// TODO Auto-generated method stub
		return dao.searchUser(username);
	}

	@Override
	public List<Fisuser> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

}
