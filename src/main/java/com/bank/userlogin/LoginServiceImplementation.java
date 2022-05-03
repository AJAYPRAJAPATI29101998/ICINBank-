package com.bank.userlogin;
import java.util.List;

import com.bank.UserRegistration.*;
public interface LoginServiceImplementation {

	List<UserData> getUserbyEmailPassword(String email, Integer password);
	
}
