package com.Employee.EmployeeCorner.Service;

import com.Employee.EmployeeCorner.Controllers.Bean.LoginReqBean;

public interface LoginService {
	
	
	LoginReqBean validateUser(String userid,String Password);
}
