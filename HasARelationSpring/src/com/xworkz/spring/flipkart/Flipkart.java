package com.xworkz.spring.flipkart;

public class Flipkart {

	private int frofit;
	private CourierService courierService;
	
	public Flipkart(int frofit,CourierService courierService) {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
		this.frofit=frofit;
		this.courierService=courierService;
	}
	

	public void sellProduct(String product){
		System.out.println("invoked sellProduct(....)");
		if(product!=null) {
			System.out.println("selling product\t"+product);
			courierService.delivery(product);
			return;
		}
		System.out.println("not selling");
	}
}
