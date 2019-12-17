package com.minbo.shirotest.dao;

import java.util.List;

import com.minbo.shirotest.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper {
	
	List<Role> findByUserName(String userName);
}
