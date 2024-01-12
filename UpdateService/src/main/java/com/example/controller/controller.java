package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/update")
	public ResponseEntity<String> updateEmpPost(@RequestBody Emp emp) {
	    if (repo.existsById(emp.getId())) {
	        Emp existingemp = repo.findById(emp.getId()).orElse(null);

	        if (existingemp != null) {
	            if (emp.getFirst_name() != null && !emp.getFirst_name().isEmpty()) {
	                existingemp.setFirst_name(emp.getFirst_name());
	            }
	            if (emp.getLast_name() != null && !emp.getLast_name().isEmpty()) {
	                existingemp.setLast_name(emp.getLast_name());
	            }
	            if (emp.getDob() != null && !emp.getDob().isEmpty()) {
	                existingemp.setDob(emp.getDob());
	            }
	            if (emp.getPosition() != null && !emp.getPosition().isEmpty()) {
	                existingemp.setPosition(emp.getPosition());
	            }
	            if (emp.getDepartment() != null && !emp.getDepartment().isEmpty()) {
	                existingemp.setDepartment(emp.getDepartment());
	            }
	            if (emp.getHire_date() != null && !emp.getHire_date().isEmpty()) {
	                existingemp.setHire_date(emp.getHire_date());
	            }
	            if (emp.getSalary() != 0) {
	                existingemp.setSalary(emp.getSalary());
	            }
	            if (emp.getPassword() != null && !emp.getPassword().isEmpty()) {
	                existingemp.setPassword(passwordEncoder().encode(emp.getPassword()));
	            }
	            if (emp.getRole() != null && !emp.getRole().isEmpty()) {
	                existingemp.setRole(emp.getRole());
	            }
	            if (emp.getPhonenumber() != null && !emp.getPhonenumber().isEmpty()) {
	                existingemp.setPhonenumber(emp.getPhonenumber());
	            }

	            repo.save(existingemp);
	            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Employee has been updated");
	        }

	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee has not been found");
	    }

	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Employee cannot be updated");
	}

	
}
