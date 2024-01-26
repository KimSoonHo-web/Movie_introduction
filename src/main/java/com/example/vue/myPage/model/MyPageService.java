package com.example.vue.myPage.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vue.myPage.mapper.MyPageMapper;
import com.example.vue.myPage.vo.MyPageVo;

@Service
public class MyPageService {

	@Autowired
	MyPageMapper myPageMapper;

	public MyPageVo updateUser(MyPageVo userVo) {
		myPageMapper.updateUser(userVo);
		return userVo;
	}

	public List<MyPageVo> userListForm() {
		// TODO Auto-generated method stub
		return myPageMapper.userListForm();
	}

	public int delectUser(int id) {
		// TODO Auto-generated method stub
		return myPageMapper.delectUser(id);
	}

	public int upDateUserRole(int id, String newUserRole) {
		// TODO Auto-generated method stub
		return myPageMapper.upDateUserRole(id,newUserRole);
	}

}
