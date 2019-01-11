package com.jamesproctor.libraryproject.library_project.domain.entities;

public class AudioBook extends Book {

	public AudioBook() {
		// TODO Auto-generated constructor stub
	}
	
	private double listenTime;
	private String narrator;
	private String fileType;
	
	public double getListenTime() {
		return listenTime;
	}
	
	public String getNarrator() {
		return narrator;
	}
	
	public String getFileType() {
		return fileType;
	}

}
