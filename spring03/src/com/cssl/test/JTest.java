package com.cssl.test;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cssl.controller.UsersController;

class JTest {
	
	private static AbstractApplicationContext ctx;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//启动IoC容器		
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	void testController() {
		UsersController ctl = ctx.getBean(UsersController.class);
		String r = null;
		try {
			r = ctl.login();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("r:"+r);
	}


	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//关闭容器
		ctx.close();
	}
}
