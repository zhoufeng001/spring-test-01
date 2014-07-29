package com.spring.service.impl;

import com.spring.service.PersonService;

public class PersonServiceImpl implements PersonService{

	private String name ;
	
	public void sayHello() {
		System.out.println("Hello World!");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
