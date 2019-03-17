package com.xworkz.spring.bean;

public class Xworkz {

	private String location;
	private Trainer trainer;

	public Xworkz(String location) {
		// TODO Auto-generated constructor stub
		System.out.println("created.....\t" + this.getClass().getSimpleName());
		this.location = location;
	}

	public void training(String courseName) {
		System.out.println("invoked training ....\t");
		if (courseName != null) {
			System.out.println("teaching :\t" + courseName);
			trainer.provideRealExamples();
			return;
		}
		System.out.println("not training");

	}

	public void setTrainer(Trainer trainer) {
		System.out.println("invoked setTrainer" + trainer);
		this.trainer = trainer;
	}

}
