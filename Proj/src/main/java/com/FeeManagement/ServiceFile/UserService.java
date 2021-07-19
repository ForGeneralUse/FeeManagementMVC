 package com.FeeManagement.ServiceFile;

import com.FeeManagement.entityFile.Login;
import com.FeeManagement.entityFile.Student;
import com.FeeManagement.entityFile.User;

public interface UserService {

	int register(Student student);

	User validateUser(Login login);
}
