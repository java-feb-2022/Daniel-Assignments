package com.dkong.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.dkong.bookClub.models.Book;
import com.dkong.bookClub.models.LoginUser;
import com.dkong.bookClub.models.User;
import com.dkong.bookClub.services.BookService;
import com.dkong.bookClub.services.UserService;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @Autowired
    private BookService bookServ;
    
    @GetMapping("/")
    public String index(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, 
            Model model, 
            HttpSession session) {
        
        // TO-DO Later -- call a register method in the service 
        // to do some extra validations and create a new user!
        
        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        
        // No errors! 
        userServ.register(newUser, result);
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("loggedInUser", newUser);
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
            BindingResult result, 
            Model model, 
            HttpSession session) {
        
        // Add once service is implemented:
        // User user = userServ.login(newLogin, result);
    	User loggedInUser = userServ.login(newLogin, result);
        if(result.hasErrors()) {
        	model.addAttribute("newUser", new User());
            return "index.jsp";
        }
    
        // No errors! 
        
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("loggedInUser", loggedInUser);
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String dashboard(Model model, HttpSession session) {
    	model.addAttribute("books", bookServ.allBooks());
    	
    	return "dashboard.jsp";
    }
    
    @GetMapping("/newbook")
    public String newbook(Model model, 
    		HttpSession session,
    		@ModelAttribute ("newBook") Book newBook) {
    	
    	return "newbook.jsp";
    }
    
    @PostMapping("/createBook")
    public String createBook(Model model,
    		HttpSession session,
    		@Valid @ModelAttribute ("newBook") Book newBook,
    		BindingResult result) {
    	if(result.hasErrors()) {
    		return"newbook.jsp";
    	}
    	else {
    		bookServ.create(newBook, result);
    	}
    	return "redirect:/home";
    }
    
    @GetMapping("/book/{id}")
    public String details(@PathVariable Long id,
    		Model model,
    		HttpSession session) {
    	model.addAttribute("book", bookServ.findById(id));
    	return "details.jsp";
    }
    
    @GetMapping("/book/{id}/edit")
    public String edit(@PathVariable Long id,
    		Model model,
    		HttpSession session,
    		@Valid @ModelAttribute ("editBook") Book editBook,
    		BindingResult result) {
    	
    	model.addAttribute("book", bookServ.findById(id));
    	
    	return "edit.jsp";
    }
    
    @PutMapping("/book/{id}/update")
    public String update(@PathVariable Long id,
    		Model model,
    		HttpSession session,
    		@Valid @ModelAttribute ("editBook") Book editBook,
    		BindingResult result) {
    	
    	if(result.hasErrors()) {
    		return"edit.jsp";
    	}
    	else {
    		bookServ.update(editBook, result);
    	}
    	return "redirect:/home";
    }
    
    @GetMapping("/book/{id}/delete")
    public String delete(@PathVariable Long id,
    		HttpSession session) {
    	bookServ.delete(id);
    	return "redirect:/home";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}
