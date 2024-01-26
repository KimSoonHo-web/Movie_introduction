package com.example.vue.myPage.vo;

public class MyPageVo {

	private int id;
	private String email;
    private String name;
    private String password;
    private String gender;
    private boolean agree;
    private String userRole;
    
    
    public MyPageVo() {
		// TODO Auto-generated constructor stub
	}


	public MyPageVo(int id, String email, String name, String password, String gender, boolean agree, String userRole) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.agree = agree;
		this.userRole = userRole;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isAgree() {
		return agree;
	}


	public void setAgree(boolean agree) {
		this.agree = agree;
	}


	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}


	@Override
	public String toString() {
		return "MyPageVo [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", gender="
				+ gender + ", agree=" + agree + ", userRole=" + userRole + "]";
	}
    
    
	
	
	
}
