package com.realcoderz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realcoderz.model.Login;
import com.realcoderz.repository.LoginDAO;
@Service
public class LoginService {
	@Autowired
	private LoginDAO loginDAO;
	public String validate(Login loginBean) {
		return loginDAO.validate(loginBean);
	}

}
