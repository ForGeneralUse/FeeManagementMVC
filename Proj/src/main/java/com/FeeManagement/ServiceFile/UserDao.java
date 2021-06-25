package com.FeeManagement.ServiceFile;

import com.FeeManagement.entityFile.Login;
import com.FeeManagement.entityFile.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
}
