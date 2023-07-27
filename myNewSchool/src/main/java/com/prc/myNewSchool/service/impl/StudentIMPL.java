package com.prc.myNewSchool.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.prc.myNewSchool.dto.LoginDto;
import com.prc.myNewSchool.dto.StudentDto;
import com.prc.myNewSchool.entity.Student;
import com.prc.myNewSchool.repo.StudentRepo;
import com.prc.myNewSchool.response.LoginMesage;
import com.prc.myNewSchool.service.StudentService;

@Service
public class StudentIMPL implements StudentService{


    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    
    private PasswordEncoder passwordEncoder;
    
    @Override
    public String addStudent(StudentDto studentDto) {
        Student student = new Student(
        		studentDto.getStudentid(),
        		studentDto.getStudentname(),
        		studentDto.getEmail(),
        		this.passwordEncoder.encode(studentDto.getPassword())
        		);
             
        studentRepo.save(student);
       return student.getStudentname(); 
    }
    StudentDto studentDto;
    
    @Override
    public LoginMesage loginStudent(LoginDto loginDto) {
        String msg = "";
        Student student1 = studentRepo.findByEmail(loginDto.getEmail());
        if (student1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = student1.getPassword();
            
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Student> student = studentRepo.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (student.isPresent()) {
                    return new LoginMesage("Login Success", true);
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {
                return new LoginMesage("password Not Match", false);
            }
        }else {
            return new LoginMesage("Email not exits", false);
        }
    }

}
