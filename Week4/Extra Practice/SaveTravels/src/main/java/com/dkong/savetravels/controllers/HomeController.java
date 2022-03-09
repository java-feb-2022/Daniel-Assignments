package com.dkong.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dkong.savetravels.models.Expense;
import com.dkong.savetravels.services.ExpenseService;

@Controller
public class HomeController {

	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/")
	public String expenses(Model model, @ModelAttribute("expense") Expense expense) {
		model.addAttribute("expenses", expenseService.allExpenses());
		return "expenses.jsp";
	}
	
	@PostMapping("/")
	public String create(Model model, @Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		model.addAttribute("expenses", expenseService.allExpenses());
		if(result.hasErrors()) {
			return"expenses.jsp";
		} else {
			expenseService.createExpense(expense);
			
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/expense/{id}")
	public String edit(Model model, @PathVariable("id") Long id) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PutMapping("/expense/{id}/update")
	public String update(Model model, @Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		model.addAttribute("expenses", expenseService.allExpenses());
		if(result.hasErrors()) {
			return"edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/expense/{id}")
	public String delete(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
}
