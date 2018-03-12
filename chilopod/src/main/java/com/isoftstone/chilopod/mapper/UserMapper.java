package com.isoftstone.chilopod.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.isoftstone.chilopod.bean.User;

@Mapper
public interface UserMapper {
	
	@Insert("insert into User (id,username,password,usernick,description) values(#{id},#{username},#{password},#{usernick},#{description})")
	public Integer add(User user);
	
	@Delete("delete from User where id=#{arg1}")
	public Integer deleteById(String id);
	
	@Update("update User set username=#{username},password=#{password},usernick=#{usernick},description=#{description} where id=#{id}")
	public Integer update(User user);
	
	@Select("select * from User where id=#{arg1}")
	public User getById(String id);
	
	@Select("select * from User order by id desc")
	public List<User> queryList();
	
}
