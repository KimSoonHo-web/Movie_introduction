package com.example.vue.join.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vue.join.mapper.JoinMapper;
import com.example.vue.join.vo.JoinVo;

@Service
public class JoinService {

	@Autowired
	JoinMapper joinMapper;
	
	
	public boolean checkEmailExists(String email) {
        return joinMapper.checkEmailExists(email) > 0;

	}
	

	public void joinUser(JoinVo joinVo) {
		
		 joinMapper.insertUser(joinVo);
	}




}
