package com.realcoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.realcoderz.model.Login;
import com.realcoderz.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
    @RequestMapping("validateLogin")
	public ModelAndView validateLogin(@RequestParam ("userName")String userName,
			@RequestParam ("password")String password)
	{
    	Login loginBean =new Login();
    	loginBean.setUserName(userName);
    	loginBean.setPassword(password);
    	
    	String result=loginService.validate(loginBean);
		ModelAndView model=new ModelAndView();
		if(result=="success")
		{
			model.addObject("MSG", "Welcome Logged in USers");
			model.setViewName("success");
		}
		else
		{
			model.addObject("MSG", "Please enter the correct details ");
			model.setViewName("failure");
		}
    	return model;
	}
}
