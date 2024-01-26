package com.example.vue.myPage.vo;

public class UserRoleUpdateRequest {

	private int userId;
	private String newUserRole;
	
	public UserRoleUpdateRequest() {
		// TODO Auto-generated constructor stub
	}

	public UserRoleUpdateRequest(int userId, String newUserRole) {
		super();
		this.userId = userId;
		this.newUserRole = newUserRole;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNewUserRole() {
		return newUserRole;
	}

	public void setNewUserRole(String newUserRole) {
		this.newUserRole = newUserRole;
	}

	@Override
	public String toString() {
		return "UserRoleUpdateRequest [userId=" + userId + ", newUserRole=" + newUserRole + "]";
	}
	
	
	
	

}
