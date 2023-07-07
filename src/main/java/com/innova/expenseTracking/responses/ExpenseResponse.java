package com.innova.expenseTracking.responses;

import com.innova.expenseTracking.entities.Expense;
import com.innova.expenseTracking.entities.User;

import lombok.Data;

@Data
public class ExpenseResponse {
	
	int amount;
	String date;
	
	User userId;

	public ExpenseResponse(Expense entity) {
		
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.userId = entity.getUserId();
	}
	
	
}
