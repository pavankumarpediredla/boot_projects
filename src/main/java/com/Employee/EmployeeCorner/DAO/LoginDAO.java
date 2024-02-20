package com.Employee.EmployeeCorner.DAO;

import com.Employee.EmployeeCorner.Controllers.Bean.LoginReqBean;
import com.Employee.EmployeeCorner.Controllers.Bean.LoginResBean;

public interface LoginDAO {
	
	String getUserIdPassword(LoginReqBean req);

}
