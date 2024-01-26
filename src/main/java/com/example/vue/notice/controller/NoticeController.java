package com.example.vue.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vue.notice.model.NoticeService;
import com.example.vue.notice.vo.NoticeVo;

@RestController
@RequestMapping("/api")
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	


	@GetMapping("/notices")
	public List<NoticeVo> noticeList() {

		List<NoticeVo> noticeResult = noticeService.noticeList();

		//System.out.println("noticeResult : " + noticeResult);

		return noticeResult;

	}

	@GetMapping("/noticeDetail")
	public List<NoticeVo> noticeDetail(@RequestParam ("noticeId") int id) {
		
		//System.out.println("ididid :  " + id);

		List<NoticeVo> noticeDetailResult = noticeService.noticeDetail(id);

		//System.out.println("noticeResult : " + noticeDetailResult);
		
		//System.out.println("noticeDetailResult : " + noticeDetailResult);

		return noticeDetailResult;

	}
	
	// 조회수 증가
	@PostMapping("increaseViewCount")
	public void viewCount(@RequestParam("userId") int userId, @RequestParam("noticeId") int noticeId) {
	  System.out.println("userId : " + userId);
	  System.out.println("noticeId : " + noticeId);
	  // 프로시저 호출
	  jdbcTemplate.update("CALL increaseViewCount(?, ?)", userId, noticeId);
	  
	 // int updateCount = noticeService.viewCount(userId, noticeId);
	  
	 // System.out.println("updateCount : " + );

//	  return updateCount;
	}
	
}
