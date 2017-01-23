package org.binggo.testspring;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(String.format("%s are running", name));
	}
	
	public void sayHello() {
		System.out.println(String.format("hello, i'm %s", name));
	}
}
