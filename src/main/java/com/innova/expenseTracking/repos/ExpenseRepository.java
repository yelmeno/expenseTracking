package com.innova.expenseTracking.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.expenseTracking.entities.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
