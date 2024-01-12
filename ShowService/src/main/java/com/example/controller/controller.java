package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/show")
//	@PreAuthorize("hasAuthority(ADMIN)")
	public Iterable<Emp> ShowEmp() {
        return repo.findAll();
    }
	@PostMapping("/show")
	public Emp ShowEmpId(@RequestBody int id) {
        Emp e = repo.findById(id).orElse(null);
        return e;
    }
	
	@GetMapping("/show/{username}")
	public Emp ShowEmpGet(@PathVariable String username) {
		Emp e = repo.findByusername(username);
		return e;
	}
	
}
