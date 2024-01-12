package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.EmpRepository;


@RestController
@RequestMapping("/emp")
@CrossOrigin(origins = "*")
public class controller {
	@Autowired
	private EmpRepository repo;
	
	@GetMapping("/del/{id}")
	public ResponseEntity<String> DelEmpPost(@PathVariable("id") int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Employee Has been Deleted");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Employee Can't be Deleted");
	       
    }
	
}
