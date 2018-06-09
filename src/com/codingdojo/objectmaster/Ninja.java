package com.codingdojo.objectmaster;

public class Ninja extends Human {
	public void Ninja() {
	super.setStealth(super.getStealth() - 50);
	}
	public int steal(int health) {
		health -= super.getStealth();
		System.out.println("Setaling! opponents health = " + health);
		return health;
	}
	public void runAway() {
		super.setHealth(super.getHealth() - 10);
		System.out.println("Runaway! Health is now = " + super.getHealth());
	}
}
