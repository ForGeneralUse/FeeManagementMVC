package com.FeeManagement.ServiceFile;

import com.FeeManagement.entityFile.Login;
import com.FeeManagement.entityFile.User;

public interface UserService {

	int register(User user);

	User validateUser(Login login);
}
