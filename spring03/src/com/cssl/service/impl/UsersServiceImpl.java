package com.cssl.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.UsersDao;
import com.cssl.pojo.Users;
import com.cssl.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersDao udao;

	@Override
	public boolean saveUsers(Users user) throws SQLException {
		System.out.println("UsersServiceImpl saveUsers...");
		
		deleteUsers(1);
		
		if(udao.insertUsers(user)>0) {	
			//throw new RuntimeException("自己无聊抛的。。。");
			return true;
		}
			
		return false;
	}

	@Transactional(readOnly = true)
	@Override
	public int deleteUsers(int id) {
		System.out.println("UsersServiceImpl deleteUsers");
		return id;
	}

}
