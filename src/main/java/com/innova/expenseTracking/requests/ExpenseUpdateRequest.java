package com.innova.expenseTracking.requests;

import com.innova.expenseTracking.entities.User;

import lombok.Data;

@Data
public class ExpenseUpdateRequest {
	 
	User userId;
	
}
