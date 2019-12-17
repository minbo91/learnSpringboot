package com.minbo.shirotest.dao;

import java.util.List;

import com.minbo.shirotest.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserPermissionMapper {
	
	List<Permission> findByUserName(String userName);
}
