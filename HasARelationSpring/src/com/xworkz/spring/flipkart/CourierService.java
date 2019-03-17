package com.xworkz.spring.flipkart;

public class CourierService {
	
	private String branchName;
	
	public CourierService() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}
	
	public void delivery(String product) {
		System.out.println("invoked delivery(.....)"+product);
		System.out.println("product delivered");
	}

	public void setBranchName(String branchName) {
		System.out.println("invoked setBranchName(...)");
		this.branchName = branchName;
	}
}
