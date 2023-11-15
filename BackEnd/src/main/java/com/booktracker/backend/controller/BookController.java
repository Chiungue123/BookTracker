package com.booktracker.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booktracker.backend.jpa.BookJPA;
import com.booktracker.backend.service.BookService;

@RestController
public class BookController {
	
	BookJPA book1 = new BookJPA(1, "Title1", "Author1", 1000);
	BookJPA book2 = new BookJPA(2, "Title2", "Author2", 2000);
	BookJPA book3 = new BookJPA(3, "Title3", "Author3", 3000);
	
	@Autowired
	BookService service;

	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/test")
	public List<BookJPA> hello() {
		List<BookJPA> test = new ArrayList<BookJPA>();
		test.add(book1);
		test.add(book2);
		test.add(book3);
		
		logger.debug("GET Test");
		return test;
	}
	
	@PostMapping("/create")
	public void create(@RequestBody BookJPA book) {
		
		logger.debug("POST: Create Book");
		this.service.createBook(book);
	}
	
	@GetMapping("/books/{id}")
	public BookJPA getBookById(@PathVariable int id) {
	    return this.service.findById(id);
	}
	
}
