package com.innova.expenseTracking.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.innova.expenseTracking.entities.Expense;
import com.innova.expenseTracking.entities.User;
import com.innova.expenseTracking.repos.ExpenseRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class ExpenseService {

		private ExpenseRepository expenseRepository;
		
	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}

	public Expense saveOneExpense(Expense newExpense) {
		return expenseRepository.save(newExpense);
	}

	public Expense getOneUserById(Long userId) {
		return expenseRepository.findById(userId).orElse(null);
	}

	
}
