package com.jamesproctor.libraryproject.library_project.domain.entities;

public class PhysicalBook extends Book {

	public PhysicalBook() {
		// TODO Auto-generated constructor stub
	}
	
	private int numOfPages;
	private String bookType;
	
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public String getBookType() {
		return bookType;
	}

}
