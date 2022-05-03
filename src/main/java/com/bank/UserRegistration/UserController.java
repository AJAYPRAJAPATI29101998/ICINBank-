package com.bank.UserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {
		
	@Autowired
	private UserService userservice;
	
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/users")
	public List<UserData> userList() {
		
		return userservice.userList();
	}
	
	@CrossOrigin(origins = "http://localhost:3000/")
	@PostMapping("/addUser")
	public void addStudent(@RequestBody UserData userdata) {
		userservice.addNewUser(userdata);
	}
	
	@GetMapping("/users/{id}")
	public Optional<UserData> getById(@PathVariable int id) {
	return	userservice.getById(id);
	}
	
}
