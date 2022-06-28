package com.accolite.spring;

public class Airtel {

	private int id;
	private Service service;

	public Airtel(int id) {
		this.id = id;
		System.out.println("Constructor based injection.. id set to "+id);
	}

	public void setService(Service service) {
		this.service = service;
		System.out.println("Setter based injection");
	}

	public void callService() {
		service.service();
	}

}
