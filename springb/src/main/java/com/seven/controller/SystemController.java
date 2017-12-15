package com.seven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seven.pojo.Users;
import com.seven.service.IUsersService;

@Controller
@RequestMapping("/")
public class SystemController {

	@Autowired
	private Users users;
	@Autowired
	private IUsersService usersService;
	
	@RequestMapping("hello")
	public Users hello(){
		return users;
	}
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String login(int id,String password){
		if(usersService.login(new Users(id,password)) != null){
			return "index";
		}
		return "login";
	}
}
