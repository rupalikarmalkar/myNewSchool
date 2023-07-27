package com.prc.myNewSchool.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	

	    @Id
//	    @Column(name="student_id", length = 45)
	    @Column(name="student_id")
        @GeneratedValue(strategy = GenerationType.AUTO)
	    private int studentid;

//	    @Column(name="student_name", length = 255)
	    @Column(name="student_name")
	    private String studentname;

//	    @Column(name="email", length = 255)
	    @Column(name="email")
        private String email;

//	    @Column(name="password", length = 50)
	    @Column(name="password")
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

		public Student(int studentid, String studentname, String email, String password) {
			super();
			this.studentid = studentid;
			this.studentname = studentname;
			this.email = email;
			this.password = password;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub 
		}

		@Override
		public String toString() {
			return "Student [studentid=" + studentid + ", studentname=" + studentname + ", email=" + email
					+ ", password=" + password + "]";
		}

	    
	    


}
