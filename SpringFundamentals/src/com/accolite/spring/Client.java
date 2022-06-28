package com.accolite.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml"); //Airtel, Service, Missedcall, HelloTune, Dataservice
		Airtel airtel= context.getBean("airtel", Airtel.class);
		airtel.callService();
		
		
		ApplicationContext context1=new ClassPathXmlApplicationContext("bean_autowire.xml"); //Human, Heart
		Human human= context1.getBean("human",Human.class);
		human.callPumping();
	}

}
