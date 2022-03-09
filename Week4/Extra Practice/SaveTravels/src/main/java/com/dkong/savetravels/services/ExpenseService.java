package com.dkong.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dkong.savetravels.models.Expense;
import com.dkong.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;	
	}
	
	public List<Expense> allExpenses(){
		return expenseRepo.findAll();
	}
	
	public Expense createExpense(Expense e) {
		return expenseRepo.save(e);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	public Expense updateExpense(Expense e) {
		
		return expenseRepo.save(e);
	}
	
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
	
}
