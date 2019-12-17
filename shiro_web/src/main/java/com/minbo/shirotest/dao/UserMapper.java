package com.minbo.shirotest.dao;

import com.minbo.shirotest.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
	User findByUserName(String userName);
}
