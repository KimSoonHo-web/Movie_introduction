package com.example.vue.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vue.login.model.LoginService;
import com.example.vue.login.vo.LoginVo;

@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	 @PostMapping("/login")
	    public LoginVo login(@RequestBody LoginVo loginVo) {
		 
		 System.out.println("입력한 이메일 : " +  loginVo.getEmail());
		 System.out.println("입력한 비밀번호 : " + loginVo.getPassword());
		 LoginVo user = loginService.findByEmailAndPassword(loginVo.getEmail(), loginVo.getPassword());
//		 	System.out.println("user : " + user);
//	        if (user != null) {
//	            // 로그인 성공 처리
//	            return "success";
//	        } else {
//	            // 로그인 실패 처리
//	            return "fail";
//	        }
		 System.out.println("user: " + user);
		 return user;
	    }
	
	
	
}
