package com.jamesproctor.libraryproject.library_project.domain.entities;

import java.util.Date;

public class Book extends LibraryItem {
	
	private String author;
	private String publisher;
	

	

	public Book() {
		
	}

	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}

}
