package com.seven.service;

import com.seven.pojo.Users;

public interface IUsersService {

	Users login(Users users);
	
	boolean reg(Users users);
}
