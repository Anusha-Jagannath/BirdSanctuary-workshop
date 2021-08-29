package com.bl.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

	public Duck() {
		color = Color.GREY;
		name = "Duck";
	}

	@Override
	public void fly() {
		System.out.println(name+" can fly");
	}

	@Override
	public void swim() {
		System.out.println(name+" can swim");	
	}

	@Override
	void eat() {
		System.out.println(name+" can eat");
	}

}

