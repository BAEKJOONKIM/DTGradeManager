package com.metanetdt.manager.vo;

public class ProfessorVO {
	private String professorId;
	private String name;
	private String phoneId;
	private String gender;
	private String email;
	private String pw;
	//construct
	public ProfessorVO(){}
	public ProfessorVO(String professorId, String name, String phoneId, String gender, String email, String pw) {
		this.professorId = professorId;
		this.name = name;
		this.phoneId = phoneId;
		this.gender = gender;
		this.email = email;
		this.pw = pw;
	}
	//getter setter
	public String getProfessorId() {
		return professorId;
	}
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	//toString
	@Override
	public String toString() {
		return "ProfessorVO [professorId=" + professorId + ", name=" + name + ", phoneId=" + phoneId + ", gender="
				+ gender + ", email=" + email + ", pw=" + pw + "]";
	}
	
	
	
	
	
}
