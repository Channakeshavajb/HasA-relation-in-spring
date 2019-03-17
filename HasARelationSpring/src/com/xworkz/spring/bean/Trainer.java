package com.xworkz.spring.bean;

public class Trainer {
	
	private String expertise;

	public Trainer() {
		
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void provideRealExamples() {
		System.out.println("invoked provideRealExamples(....)");
	}

	public void setExpertise(String expertise) {
		System.out.println("invoked expertise\t" + expertise);
		this.expertise = expertise;
	}
}
