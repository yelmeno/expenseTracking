package com.innova.expenseTracking.responses;

import com.innova.expenseTracking.entities.User;

import lombok.Data;

@Data
public class UserResponse {
	
	String firstname;
	String lastname;
	
	public UserResponse(User entity) {
		this.firstname=entity.getFirstname();
		this.lastname=entity.getLastname();
		
	}
}
