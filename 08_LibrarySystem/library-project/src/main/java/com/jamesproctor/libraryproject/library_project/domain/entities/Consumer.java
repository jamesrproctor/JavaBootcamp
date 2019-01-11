package com.jamesproctor.libraryproject.library_project.domain.entities;

import java.util.UUID;

public abstract class Consumer {
	
	final String uuid = UUID.randomUUID().toString().replace("-", "");
	
	private String name; 
	private int age;
	


}
