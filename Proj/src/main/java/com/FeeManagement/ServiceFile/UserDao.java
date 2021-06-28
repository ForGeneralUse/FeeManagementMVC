package com.FeeManagement.ServiceFile;

import com.FeeManagement.entityFile.Login;
import com.FeeManagement.entityFile.Student;
import com.FeeManagement.entityFile.User;

public interface UserDao {
	int register(Student studnet);
	int register(User user);
	User validateUser(Login login);
}
