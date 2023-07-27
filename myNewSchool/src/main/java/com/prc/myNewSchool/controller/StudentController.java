package com.prc.myNewSchool.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prc.myNewSchool.dto.LoginDto;
import com.prc.myNewSchool.dto.StudentDto;
import com.prc.myNewSchool.response.LoginMesage;
import com.prc.myNewSchool.service.StudentService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("api/v1/student")
public class StudentController {
	

	    @Autowired
	    private StudentService studentService;
	    @PostMapping(path = "/save")
	    public String saveStudent(@RequestBody StudentDto studentDto)
	    {
	        String id = studentService.addStudent(studentDto);
	        return id;
	    }
	    @PostMapping(path = "/login")
	    public ResponseEntity<?> loginStudent(@RequestBody LoginDto loginDto)
	    {
	        LoginMesage loginMesage= studentService.loginStudent(loginDto);
	        return ResponseEntity.ok(loginMesage);
	    }
	

	}
	
