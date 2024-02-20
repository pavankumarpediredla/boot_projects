package com.Employee.EmployeeCorner.DAO.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.Employee.EmployeeCorner.Controllers.Bean.LoginReqBean;
import com.Employee.EmployeeCorner.Controllers.Bean.LoginResBean;
import com.Employee.EmployeeCorner.DAO.LoginDAO;
import com.mysql.cj.protocol.Resultset;

import jakarta.annotation.PostConstruct;

@Repository
public class LoginDAOImpl extends JdbcDaoSupport implements LoginDAO{

	@Autowired
	DataSource datesource;
	
	@PostConstruct
	private void initiazie() {
	setDataSource(datesource);	
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public String getUserIdPassword(LoginReqBean req) {
		String status=null;
		String query="select count(*)as status from employee_master where Email=? and user_password=?;";
		try {
			System.out.println(" DAO ===LAYER ===>>>"+req.toString());
			status = getJdbcTemplate().queryForObject(
			    query,
			    new Object[]{req.getUserId(), req.getPassword()},
			    String.class
			);
			System.out.println("Status: " + status);
		}catch(Exception e) {
			
		}
		return status;
	}

}
