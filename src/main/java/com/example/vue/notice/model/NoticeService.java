package com.example.vue.notice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vue.notice.mapper.NoticeMapper;
import com.example.vue.notice.vo.NoticeVo;

@Service
public class NoticeService {

	@Autowired
	NoticeMapper noticeMapper;
//	@Autowired
//	JdbcTemplate jdbcTemplate;

	public List<NoticeVo> noticeList() {
		return noticeMapper.noticeList();
	}

	public List<NoticeVo> noticeDetail(int id) {
		// TODO Auto-generated method stub
		return noticeMapper.noticeDetail(id);
	}
//
//	public int viewCount(int userId, int noticeId) {
//		 // jdbcTemplate.update("CALL increaseViewCount(?, ?)", userId, noticeId);
//		return noticeMapper.viewCount(userId,noticeId);
//	}
}
