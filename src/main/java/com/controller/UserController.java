package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserService;
import com.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@CrossOrigin("*")
	@GetMapping("/getallusers")
	public List<User> getAllUsers()
	{
		
		return service.findAll();
		
	}
	
	
	
	@CrossOrigin("*")
	@PostMapping("/adduser")
	
	public ResponseEntity<?> addUser(@RequestBody User user)
	{
		
		service.add(user);
		return ResponseEntity.status(HttpStatus.OK).body("User added success fully");
		
		
	}
	
	
	@CrossOrigin("*")
	@GetMapping("/finduser/{id}")
	public User findUser(@PathVariable String id)
	{
		
		return service.find(id);
	}

}
