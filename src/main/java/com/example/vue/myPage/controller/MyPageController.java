package com.example.vue.myPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vue.myPage.model.MyPageService;
import com.example.vue.myPage.vo.MyPageVo;
import com.example.vue.myPage.vo.UserRoleUpdateRequest;

@RestController
@RequestMapping("/api")
public class MyPageController {

	@Autowired
	MyPageService myPageService;
	
	@PostMapping("/userUpdate")
	public MyPageVo userUpdate(@RequestBody MyPageVo userVo) {
		
		System.out.println("userVo : " + userVo);
		
		MyPageVo result = myPageService.updateUser(userVo); 
		
		return result;
	}
	
	@GetMapping("/users")
	public List<MyPageVo> userListFrom(){
		
		List<MyPageVo> userList = myPageService.userListForm();
		//System.out.println("userList : " + userList);
		return userList;
	}
	
	@PostMapping("/deleteUser")
	public int deleteUser(@RequestParam("userId") int id) {
	    System.out.println("Received ID number: " + id);

	    int result = myPageService.delectUser(id);
	    System.out.println("result : " + result);
	    return result;
	}
	
	@PostMapping("/upDateRole")
	public int upDateUserRole(@RequestBody MyPageVo request) {
		
		int id = request.getId();
		String newUserRole = request.getUserRole();
		
		System.out.println("Received ID: " + id);
	    System.out.println("Received permissions: " + newUserRole);
		
		int roleResult = myPageService.upDateUserRole(id, newUserRole);
		
		System.out.println("roleResult : " + roleResult);
		
		return roleResult;
	}

	
}
