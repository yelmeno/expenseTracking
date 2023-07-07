package com.innova.expenseTracking.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.expenseTracking.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);

}
