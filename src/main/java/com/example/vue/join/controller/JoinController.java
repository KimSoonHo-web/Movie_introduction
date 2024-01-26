package com.example.vue.join.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vue.join.model.JoinService;
import com.example.vue.join.vo.JoinVo;

@RestController
public class JoinController {

	@Autowired
	JoinService joinService;
	
	// 이메일 중복 확인 API
//	@PostMapping("/api/check-email")
//	public boolean checkEmailExists(@RequestParam String email) {
//		System.out.println("email : " + email);
//	    return joinService.checkEmailExists(email);
//	}
	
	// 회원가입 API
	@PostMapping("/api/join")
	public String joinUser(@RequestBody JoinVo joinVo) {
	    System.out.println("joinVo : " + joinVo);

	    // 이메일 중복 확인
	    if (joinService.checkEmailExists(joinVo.getEmail())) {
	        return "EmailAlreadyExists"; // 중복된 이메일의 경우 문자열 반환
	    }

	    joinService.joinUser(joinVo);
	    return "Success"; // 성공적인 경우 'Success' 문자열 반환
	}
}
