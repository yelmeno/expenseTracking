package com.innova.expenseTracking.exceptions;

public class UserNotFoundExceptions extends RuntimeException {
	
	
	public void UserNotFoundException(String message) {
		System.out.println(message);
	}
}

