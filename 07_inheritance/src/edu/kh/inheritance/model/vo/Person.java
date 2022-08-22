package edu.kh.inheritance.model.vo;

public class Person {
	
	private String name;
	private int age;
	
	// ctrl + space bar + enter
	 public Person() { }
	 
	// alt + s 또는 alt + shift + s -> o
	// 매개변수 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 
	public String getName() {
		return name;
	}
	 
	public String setName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge() {
		return age;
	}
	 
}
