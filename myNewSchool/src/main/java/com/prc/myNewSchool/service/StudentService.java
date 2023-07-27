package com.prc.myNewSchool.service;

import com.prc.myNewSchool.dto.LoginDto;
import com.prc.myNewSchool.dto.StudentDto;
import com.prc.myNewSchool.response.LoginMesage;

public interface StudentService {
	  String addStudent(StudentDto studentDto);

	LoginMesage loginStudent(LoginDto loginDto);
	}


