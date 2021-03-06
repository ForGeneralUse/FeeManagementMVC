package com.FeeManagement.ServiceFile;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.FeeManagement.entityFile.Login;
import com.FeeManagement.entityFile.Student;
import com.FeeManagement.entityFile.User;


public class UserDaoImpl implements UserDao {
	

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int register(Student student) {
		String Regsql = "insert into users values(?,?,?,?,?,?,?,?,?)";
		 return jdbcTemplate.update(Regsql, new Object[] { student.getUserName(), student.getPassword(), student.getfName(),
				     student.getmName(),student.getlName(),student.getYearOfJoin(), student.getEmail(), student.getBranch(), student.getDob() });
	}
	
	@Override
	public int register(User user) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public User validateUser(Login login) {
		  String sql = "select * from users where username='" + login.getUserName() + "' and password='" + login.getPassword() + "'";
		  
		  List<User> users = jdbcTemplate.query(sql, new UserMapper());
		  return users.size() > 0 ? users.get(0) : null;
	}
	
}

class UserMapper implements RowMapper<User> {

	  public User mapRow ( ResultSet rs, int arg1) throws SQLException {
	    User user = new User();

	    user.setUserName(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setState(rs.getString("state"));
	    return user;
	  }


	}