package com.library.service;

import com.library.repository.*;
public class BookService {
	private BookRepository bookRepository;

    
    public BookService() {}

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void message() {
    	System.out.println("Printing");
    	bookRepository.update();
    }

	
	}


