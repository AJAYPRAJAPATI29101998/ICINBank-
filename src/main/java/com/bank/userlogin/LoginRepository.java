package com.bank.userlogin;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bank.UserRegistration.UserData;

public interface LoginRepository extends JpaRepository<UserData, Integer> {

	@Query("SELECT ud from userdata ud where ud.email=?1 and ud.password=?2")
	 List<UserData> getUserBymailAndPassword(String email,Integer password );
}
