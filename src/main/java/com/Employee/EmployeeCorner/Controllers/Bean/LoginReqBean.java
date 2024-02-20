package com.Employee.EmployeeCorner.Controllers.Bean;

import lombok.Data;

@Data
public class LoginReqBean {
	
	@Override
	public String toString() {
		return "LoginReqBean [userId=" + userId + ", password=" + password + ", status=" + status + "]";
	}
	private String userId;
	private String password;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
