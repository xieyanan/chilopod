package com.isoftstone.chilopod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isoftstone.chilopod.bean.User;
import com.isoftstone.chilopod.mapper.UserMapper;
import com.isoftstone.chilopod.web.Response;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserMapper userMapper;

	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/add")
	public Object add(User user) {
		Integer res = userMapper.add(user);
		return res==1?new Response("200","ok"):new Response("500","error");
	}
	
	/**
	 * 查看用户
	 * @param user
	 * @return
	 */
	@GetMapping(value="/view/{id}")
	public Object view(@PathVariable String id) {
		User user = userMapper.getById(id);
		return user==null?new Response("200","ok",null):new Response("200","ok", user);
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete/{id}")
	public Object delete(@PathVariable String id) {
		Integer res = userMapper.deleteById(id);
		return res==1?new Response("200","ok"):new Response("500","error");
	}
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/update")
	public Object update(User user) {
		int res = userMapper.update(user);
		return res==1?new Response("200","ok"):new Response("500","error");
	}
	
	/**
	 * 查询用户
	 * @return
	 */
	@RequestMapping(value="/query")
	public Object query() {
		List<User> result = userMapper.queryList();
		return new Response("200","查询成功",result);
	}
	
}
