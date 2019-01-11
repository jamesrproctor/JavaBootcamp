package com.jamesproctor.libraryproject.library_project.domain.entities;

import java.util.*;

public abstract class LibraryItem {
	
	final String uuid = UUID.randomUUID().toString().replace("-", "");
	
	private String title;
	private String genre;
	
	private Date dateAdded;
	private Date dateBorrowed;
	private Date yearPublished;
	
	private int totalCopies;
	private int availableCopies;
	private int borrowedCopies;
	
	// Class methods - can only view data but not change it!
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public Date getDateBorrowed() {
		return dateBorrowed;
	}
	
	public Date getYearPublished() {
		return yearPublished;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public int getBorrowedCopies() {
		return borrowedCopies;
	}

}
