package com.accolite.spring;

public class MissedCall implements Service{

	@Override
	public void service() {
		System.out.println("Missed call alert service activated");
		
	}

}
