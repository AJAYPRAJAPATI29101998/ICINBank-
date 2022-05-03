package com.bank.userlogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.UserRegistration.UserData;

@Service
public class LoginService implements LoginServiceImplementation {
	
	@Autowired
	public LoginRepository loginRepository;

	public LoginService(LoginRepository loginRepository) {
		super();
		this.loginRepository = loginRepository;
	}
	
	@Override
	public List<UserData> getUserbyEmailPassword(String email,Integer password) {
		// TODO Auto-generated method stub
		List<UserData> user = loginRepository.getUserBymailAndPassword(email,password);
		System.out.println(user);
		return user;
	}
	
	


}
