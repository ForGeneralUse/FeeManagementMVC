package com.FeeManagement.RepoFile;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FeeManagement.entityFile.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
}
