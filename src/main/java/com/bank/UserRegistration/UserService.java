package com.bank.UserRegistration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepo;
	
//	This method list of user from database
	public List<UserData> userList() {
		return userrepo.findAll();
	}
	
//this method add user to db	
	public UserData addNewUser(UserData userdata) {
		System.out.println(userdata.getEmail());
		return userrepo.save(userdata);
	}
	
	public Optional<UserData> getById(int id) {
		return userrepo.findById(id);
	}
	
}
