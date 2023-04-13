package com.examples.mvc.loginapplication.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FisuserRowMapper implements RowMapper<Fisuser>{

	@Override
	public Fisuser mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		Fisuser user = new Fisuser(rs.getString(1),rs.getString(2));
		
		return user;
	}

}
