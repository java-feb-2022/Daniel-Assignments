package com.dkong.bookClub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.dkong.bookClub.models.Book;
import com.dkong.bookClub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	public Book create(Book newBook, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		bookRepo.save(newBook);
		return null;
	}
	
	public Book findById(Long id) {
		
		return bookRepo.findById(id).orElse(null);
	}
	
	public Book update(Book editBook, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		return bookRepo.save(editBook);
	}
	
	public void delete(Long id) {
		bookRepo.deleteById(id);
	}
	
}
