package com.FeeManagement.ServiceFile;

import org.springframework.beans.factory.annotation.Autowired;

import com.FeeManagement.entityFile.Login;
import com.FeeManagement.entityFile.User;

public class UserServiceImpl {
	
	@Autowired
	  public UserDao userDao;

	  public int register(User user) {
	    return userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }

}
