package com.simplilearn.phase3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3.model.Login;

@Repository
public class LoginDAO {

	@Autowired
	JdbcTemplate template;
	
	public List<Login> getCredentials()
	{
		return template.query("select * from login", new RowMapper<Login> () 
		{
			public Login mapRow(ResultSet rs,int row) throws SQLException
			{
				Login e = new Login();
				e.setUsername(rs.getString(1));
				e.setPassword(rs.getString(2));
				return e;
			}
		});
	}
}
