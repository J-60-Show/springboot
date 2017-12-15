package com.seven.mapper;

import org.apache.ibatis.annotations.Select;

import com.seven.pojo.Users;

public interface UsersMapper {

	@Select("select * from users where id=#{id} and password=#{password}")
	Users selectUsersByUsers(Users users);
}
