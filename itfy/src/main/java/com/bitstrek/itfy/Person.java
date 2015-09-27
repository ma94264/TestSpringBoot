package com.bitstrek.itfy;

public class Person {
	private Long id;
	private String name;
	
	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
