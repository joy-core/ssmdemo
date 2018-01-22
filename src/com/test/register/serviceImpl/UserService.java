package com.test.register.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.register.dao.IUserDao;
import com.test.register.model.User;
import com.test.register.service.IUserService;

@Service("userService")
public class UserService implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	
}
