package com.library.repository;

import org.springframework.stereotype.Repository;


@Repository
public class BookRepository {
	public void update() {
		System.out.println("Updating Book....");
	}
}