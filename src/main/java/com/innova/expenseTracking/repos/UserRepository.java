package com.innova.expenseTracking.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.expenseTracking.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	

}
