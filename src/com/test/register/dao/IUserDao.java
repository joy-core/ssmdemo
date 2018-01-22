package com.test.register.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.test.register.model.User;

@MapperScan
public interface IUserDao {
	
	User getUserById(int id);
	
}
