package com.booktracker.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booktracker.backend.jpa.BookJPA;
import com.booktracker.backend.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repo;

	public BookJPA findById(int id) {
		return this.repo.findById(id).orElse(null);
	}

	public void createBook(BookJPA book) {
		this.repo.save(book);
	}
	
	public List<BookJPA> findBooks(){
		return this.repo.findAll();
	}
	
}
