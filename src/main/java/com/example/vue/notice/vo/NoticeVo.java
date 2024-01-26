package com.example.vue.notice.vo;

import java.util.Date;

public class NoticeVo {

	 	private int id; // 고유 ID
	    private String category; // 카테고리
	    private String title; // 제목
	    private String content; // 내용
	    private Date registrationDate; // 등록 날짜
	    private int views; // 조회수
	    
	    
	    public NoticeVo() {
			// TODO Auto-generated constructor stub
		}


		public NoticeVo(int id, String category, String title, String content, Date registrationDate, int views) {
			super();
			this.id = id;
			this.category = category;
			this.title = title;
			this.content = content;
			this.registrationDate = registrationDate;
			this.views = views;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getContent() {
			return content;
		}


		public void setContent(String content) {
			this.content = content;
		}


		public Date getRegistrationDate() {
			return registrationDate;
		}


		public void setRegistrationDate(Date registrationDate) {
			this.registrationDate = registrationDate;
		}


		public int getViews() {
			return views;
		}


		public void setViews(int views) {
			this.views = views;
		}


		@Override
		public String toString() {
			return "NoticeVo [id=" + id + ", category=" + category + ", title=" + title + ", content=" + content
					+ ", registrationDate=" + registrationDate + ", views=" + views + "]";
		}
	    
	    
		
		
}
