package com.accolite.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Human {
	
	@Autowired  // 3. not using setter injection -- can remove constructor and setter as well when autowire used before dependency
	@Qualifier("humanHeart")
	private Heart heart;
	
	private int id;
	
	@Value("${human.name}") // doesnt require setter since we are using field level annotation similar to autowire
	private String name;

	//@Value("${human.name}")
	public void setName(String name) {
		this.name = name;
	}

	@Required //does not create object if id is null      //not applicable at field level
	public void setId(int id) {
		this.id = id;
	}

	public Human() {
		
	}

	//1. @Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}

	//2. @Autowired
	//@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void callPumping() {
		System.out.println("id is "+id+" name is "+name);
		heart.callPumping();
	}

	
}
