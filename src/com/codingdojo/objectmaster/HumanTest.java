package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Samurai s = new Samurai();
		Ninja n = new Ninja();
		w.heal(100);
		w.Fireball(100);
		n.steal(100);
		n.runAway();
		s.deathBlow(100);
		s.meditate();
		s.Samurai();
	}
}
