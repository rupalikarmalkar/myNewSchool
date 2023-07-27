package com.prc.myNewSchool.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.prc.myNewSchool.entity.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	 Optional<Student> findOneByEmailAndPassword(String email, String password);
	 Student findByEmail(String email);

}
