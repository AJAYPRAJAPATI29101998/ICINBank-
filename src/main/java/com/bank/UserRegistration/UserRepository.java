package com.bank.UserRegistration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData , Integer> {

}
