package com.codingdojo.objectmaster;

public class Wizard extends Human {
	protected Wizard(){
		super.setHealth(super.getHealth() - 50);
		super.setIntelligence(super.getIntelligence()+5);
	}
	public int heal(int health) {
		health += getIntelligence();
		System.out.println("Heal! friends health = " + health);
		return health;
	}
	public int Fireball(int health) {
		health -= getIntelligence() * 3;
		System.out.println("Fireball! opponents health = " + health);
		return  health;
	}
}
