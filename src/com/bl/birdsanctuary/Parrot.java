package com.bl.birdsanctuary;

public class Parrot extends Bird implements Flyable  {
	
	public Parrot() {
		color = Color.GREEN;
		name = "Parrot";
	}

	@Override
	public void fly() {
		System.out.println(name+" can fly");
	}

	@Override
	void eat() {
		System.out.println(name+" can eat");
	}
	
}

