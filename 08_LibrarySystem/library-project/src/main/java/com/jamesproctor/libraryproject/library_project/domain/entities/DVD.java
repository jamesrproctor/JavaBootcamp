package com.jamesproctor.libraryproject.library_project.domain.entities;

public class DVD extends LibraryItem {

	public DVD() {
		// TODO Auto-generated constructor stub
	}
	
	private String director;
	private int ageGate;
	private String studio;
	private double runTime;
	
	public String getDirector() {
		return director;
	}
	
	public int getAgeGate() {
		return ageGate;
	}
	
	public String getStudio() {
		return studio;
	}
	
	public double getRunTime() {
		return runTime;
	}	

}
