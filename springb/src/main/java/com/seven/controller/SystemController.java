package com.seven.controller;

import javax.servlet.http.HttpSession;

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
	public String login(int id,String password,HttpSession session){
		Users users = usersService.login(new Users(id,password));
		if(users != null){
			session.setAttribute("users", users);
			return "redirect:index";
		}
		return "login";
	}
	@RequestMapping(value="index",method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="reg",method = RequestMethod.GET)
	public String reg(){
		return "reg";
	}
	
	@RequestMapping(value="reg",method = RequestMethod.POST)
	public String reg(int id, String password){
		if(usersService.reg(new Users(id,password))){
			return "redirect:login";
		}
		return "reg";
	}
}
