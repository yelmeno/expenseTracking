package com.innova.expenseTracking.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innova.expenseTracking.entities.Expense;
import com.innova.expenseTracking.entities.User;
import com.innova.expenseTracking.services.ExpenseService;
import com.innova.expenseTracking.services.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
	
	private ExpenseService expenseService;

	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@GetMapping //User getirmek istediğimizde bu methodu kullanır.
	public List<Expense> getAllUsers(){
		return expenseService.getAllExpenses();
	}
	
	@PostMapping //Create methodu kullanıcı olusturma
	public Expense createExpense (@RequestBody Expense newExpense) {
		return expenseService.saveOneExpense(newExpense);
	}
	
	@GetMapping("/{userId}")
	public Expense getOneExpense(@PathVariable Long userId) {
		//custom exception
		return expenseService.getOneUserById(userId);
	
}
}
