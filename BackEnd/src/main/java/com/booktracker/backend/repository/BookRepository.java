package com.booktracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booktracker.backend.jpa.BookJPA;

public interface BookRepository extends JpaRepository<BookJPA, Integer> {

}
