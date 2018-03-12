package com.isoftstone.chilopod;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isoftstone.chilopod.bean.User;
import com.isoftstone.chilopod.mapper.UserMapper;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		//UserMapper userMapper = context.getBean(UserMapper.class);
		//testAdd(userMapper);
		//testSelect(userMapper);
		//context.close();
	}
	
	public static void testAdd(UserMapper userMapper) {
		User user = new User();
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		user.setId(id);
		user.setUsername("xieyn"); 
		user.setPassword("xieyn"); 
		user.setUsernick("系统管理员");
		user.setDescription("用户测试数据");
		userMapper.add(user);
	}
	
	public static void testSelect(UserMapper userMapper) {
		List<User> list = userMapper.queryList();
		System.out.println(list);
	}
	
}
