package com.Employee.EmployeeCorner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com.Employee.EmployeeCorner")
public class EmployeeCornerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCornerApplication.class, args);
	
	}

}
