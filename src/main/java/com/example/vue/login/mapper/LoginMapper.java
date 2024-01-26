package com.example.vue.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.login.vo.LoginVo;

@Mapper
public interface LoginMapper {

	LoginVo findByEmailAndPassword(String email, String password);

	
	
	
}
