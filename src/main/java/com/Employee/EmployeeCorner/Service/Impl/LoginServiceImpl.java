package com.Employee.EmployeeCorner.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.EmployeeCorner.Controllers.Bean.LoginReqBean;
import com.Employee.EmployeeCorner.Controllers.Bean.LoginResBean;
import com.Employee.EmployeeCorner.DAO.LoginDAO;
import com.Employee.EmployeeCorner.Service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO loginDao;
	
	@Override
	public LoginReqBean validateUser(String userid, String Password) {
		LoginReqBean req=null;
		LoginResBean res=null;
		String status=null;
		try {
			req=new LoginReqBean();
			req.setUserId(userid);
			req.setPassword(Password);
			//res=new LoginResBean();
			System.out.println("req =====>>>>"+req.toString());
			status=loginDao.getUserIdPassword(req);
			System.out.println(" status ==========>>>>"+status);
			req.setStatus(status);
			System.out.println(" === res   ====== "+req.toString());
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
		return req;
	}

}
