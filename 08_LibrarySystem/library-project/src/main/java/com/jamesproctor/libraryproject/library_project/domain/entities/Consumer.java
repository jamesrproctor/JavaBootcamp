package com.jamesproctor.libraryproject.library_project.domain.entities;

import java.util.UUID;

public class Consumer {
	
	final String uuid = UUID.randomUUID().toString().replace("-", "");
	
	private String name; 
	private int age;
	private boolean member;
	private int itemsBorrowed;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isMember() {
		return member;
	}

	public int getItemsBorrowed() {
		return itemsBorrowed;
	}

}
