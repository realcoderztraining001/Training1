package com.realcoderz.repository;

import org.springframework.stereotype.Repository;

import com.realcoderz.model.Login;
@Repository
public class LoginDAO {

	public String validate(Login loginBean) {
		String userName= loginBean.getUserName();
		String password=loginBean.getPassword();
		if(userName.equals("naveen")&& password.equals("12345"))
		{
			return "success";
		}else
		{
			return "failure";
		}
	}

}
