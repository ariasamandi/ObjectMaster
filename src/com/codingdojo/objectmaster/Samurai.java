package com.codingdojo.objectmaster;

public class Samurai extends Human {
	public static int numberOfSamurai = 0;
	
	public void Samurai() {
		super.setHealth(super.getHealth()+100);
		numberOfSamurai++;
		System.out.println("Number of Samurai = " + numberOfSamurai+"\n");
	}
	public int deathBlow(int health) {
		health = 0;
		super.setHealth(super.getHealth()/2);
		System.out.print("DeathBlow! Samuraii's health = "+super.getHealth()+"\n");
		return health;
	}
	public void meditate() {
		super.setHealth(200);
		System.out.print("Meditate! Samurai's Health is " +  super.getHealth()+"\n");
	}
}
