package com.example.vue.login.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vue.login.mapper.LoginMapper;
import com.example.vue.login.vo.LoginVo;

@Service
public class LoginService {

	@Autowired
	LoginMapper loginMapper;

	public LoginVo findByEmailAndPassword(String email, String password) {
		
		return loginMapper.findByEmailAndPassword(email,password);
	}
}

