package com.bank.userlogin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.UserRegistration.UserData;

@RestController
public class LoginController {
	
	@Autowired	
	LoginService loginservice;
	
	@CrossOrigin(origins = "http://localhost:3000/")
	@GetMapping("/login/{email}/{password}")
	public List<UserData> getUserDetails(@PathVariable String email,@PathVariable Integer password){
		List<UserData> singleUser =  loginservice.getUserbyEmailPassword(email , password);
		
	return singleUser;	
	}
	
}
