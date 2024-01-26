package com.example.vue.myPage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.myPage.vo.MyPageVo;

@Mapper
public interface MyPageMapper {

	void updateUser(MyPageVo userVo);

	List<MyPageVo> userListForm();

	int delectUser(int id);

	int upDateUserRole(int id, String newUserRole);

}
 