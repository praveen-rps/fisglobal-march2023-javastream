package com.examples.mvc.loginapplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examples.mvc.loginapplication.model.Fisuser;
import com.examples.mvc.loginapplication.model.FisuserRowMapper;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public String addUser(Fisuser user) {
		// TODO Auto-generated method stub
		String sql = "insert into fisuser values(?,?)";
		template.update(sql,user.getUsername(),user.getPassword());
		return "added";
	}

	@Override
	public String deleteUser(Fisuser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fisuser searchUser(String username) {
		// TODO Auto-generated method stub
		String sql ="select * from fisuser";
		List<Fisuser> users = template.query(sql, new FisuserRowMapper());
		Fisuser temp = null;
		for(Fisuser usr: users) {
			if (username.equals(usr.getUsername())) {
				temp=usr;
				break;
			}
		}
		return temp;
	}

	@Override
	public List<Fisuser> getAllUsers() {
		// TODO Auto-generated method stub
		String sql ="select * from fisuser";
		List<Fisuser> users = template.query(sql, new FisuserRowMapper());
		return users;
	}

}
