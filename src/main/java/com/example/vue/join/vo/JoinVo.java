package com.example.vue.join.vo;

public class JoinVo {
	
	private String email;
    private String name;
    private String password;
    private String confirmPassword;
    private String gender;
    private boolean agree;
    
    public JoinVo() {
		// TODO Auto-generated constructor stub
	}
    
	public JoinVo(String email, String name, String password, String confirmPassword, String gender, boolean agree) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
		this.agree = agree;
	}

	@Override
	public String toString() {
		return "JoinVo [email=" + email + ", name=" + name + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", gender=" + gender + ", agree=" + agree + "]";
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	
	
	
	
    
  
    
	
	

}
