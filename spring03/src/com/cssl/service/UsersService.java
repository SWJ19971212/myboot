package com.cssl.service;

import java.sql.SQLException;

import com.cssl.pojo.Users;

public interface UsersService {
	
	public boolean saveUsers(Users user) throws SQLException;
	
	public int deleteUsers(int id);

}
