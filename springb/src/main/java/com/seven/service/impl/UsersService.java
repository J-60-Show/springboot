package com.seven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seven.mapper.UsersMapper;
import com.seven.pojo.Users;
import com.seven.service.IUsersService;

@Service
@Transactional
public class UsersService implements IUsersService{

	@Autowired
	private UsersMapper usersMapper;
	@Override
	public Users login(Users users) {
		return usersMapper.selectUsersByUsers(users);
	}
	@Override
	public boolean reg(Users users) {
		if(usersMapper.insertUsers(users) != 0){
			return true;
		}
		return false;
	}

}
