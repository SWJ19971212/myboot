package com.cssl.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cssl.pojo.Users;
import com.cssl.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	public String login() throws SQLException {
		System.out.println("UsersController login...");
		Users user = new Users();
		user.setUsername("管理员");
		user.setPassword("222");
		
		if(service.saveUsers(user))
			return "success";
		return "error";
	}

}
