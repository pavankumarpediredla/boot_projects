package com.Employee.EmployeeCorner.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		System.out.println("Entered ============== login");
		return "createUser";
	}
	@PostMapping("/saveUserData")
	public String saveNewUserData() {
		System.out.println(" entered==== save data");
		return "entered save data";
	}
}
