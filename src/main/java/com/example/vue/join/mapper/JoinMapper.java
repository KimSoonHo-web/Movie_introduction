package com.example.vue.join.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.join.vo.JoinVo;

@Mapper
public interface JoinMapper {
	
	
	int checkEmailExists(String email);

	void insertUser(JoinVo joinVo);

}
