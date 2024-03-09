package com.Employee.EmployeeCorner.Controllers;

import java.lang.System.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Employee.EmployeeCorner.Controllers.Bean.CreateUserBean;
import com.Employee.EmployeeCorner.Controllers.Bean.LoginReqBean;
import com.Employee.EmployeeCorner.Controllers.Bean.LoginResBean;
import com.Employee.EmployeeCorner.Service.LoginService;

@Controller
public class EmployeeController {
	
	@Autowired
	LoginService loginservice;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage() {
		System.out.println("Entered ============== login");
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String validateUser(ModelMap map,@RequestParam String userid,@RequestParam String password) {
		System.out.println(" login  "+userid+" =="+password);

		if(!userid.isEmpty() && !password.isEmpty())
		{
			LoginReqBean bean=loginservice.validateUser(userid,password);
			System.out.println(" bean ================== "+bean);
			if(bean!= null) {
				if(bean.getStatus().equals("1")) {
					map.put("userName", userid);
					System.out.println(" login successfull ");
					return "welcome";
				}else {
					map.put("errorMsg", "incorrect  credentials");
					System.out.println(" login failed ");
					return "login";
				}
			}
			else {
				map.put("errorMsg", "incorrect  credentials");
				System.out.println(" login failed ");
				return "login";
			}
		}
		else {
			map.put("errorMsg", "please enter valid  credentials");
			System.out.println(" login failed ");
			return "login";
		}
		
	}
	@RequestMapping(value="/createUser", method=RequestMethod.GET)
	public String createUser() {
		System.out.println("Entered ======create user======== login");
		return "createUser";
	}
	@PostMapping(value="/saveUserData")
	public String saveUserData(CreateUserBean userBean,ModelMap  map) {
	    System.out.println("Received user data: " + userBean.toString());
	    CreateUserBean respBean=loginservice.saveNewUserData(userBean);
	    if("Successfull !!!".equals(respBean.getStatus())) {
		map.put("name", "please enter valid  credentials");
		map.put("phoneNumber", "please enter valid  credentials");
		map.put("Dob", "please enter valid  credentials");
		map.put("Email", "please enter valid  credentials");
	    }else {
			map.put("errrorMsg", "please enter valid  Details");

	    }


	    return "registrationSuccess";
	}
}
