package com.prc.myNewSchool.dto;

public class StudentDto {

    private int studentid;
    private String studentname;
    private String email;
    private String password;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StudentDto(int studentid, String studentname, String email, String password) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.email = email;
		this.password = password;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDto [studentid=" + studentid + ", studentname=" + studentname + ", email=" + email
				+ ", password=" + password + "]";
	}
    


	
    
    
    

}
