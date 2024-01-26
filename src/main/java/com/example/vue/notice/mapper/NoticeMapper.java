package com.example.vue.notice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vue.notice.vo.NoticeVo;

@Mapper
public interface NoticeMapper {

	List<NoticeVo> noticeList();

	List<NoticeVo> noticeDetail(int id);

	//int viewCount(int userId, int noticeId);

	
}
