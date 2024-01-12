package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.EmpRepository;
import com.example.model.Emp;

@RestController
@RequestMapping("/emp")
@CrossOrigin(origins = "*")
public class controller {
	@Autowired
	private EmpRepository repo;
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@PostMapping("/add")
    public ResponseEntity<String> addEmp(@RequestBody Emp emp) {
        try {
        	if(repo.existsById(emp.getId())) {
        		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Employee Can't be Registered");
        	}
        	else {
        		emp.setPassword(passwordEncoder().encode(emp.getPassword()));
        		repo.save(emp);
		    	return ResponseEntity.status(HttpStatus.CREATED).body("Employee Has been Registered");
        	}
        }
        catch(Exception e) {
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Employee Can't be Registered");
        }
	}
}
