// Fichier Warrior.java
package com.myschool.game.core;
public class Warrior extends Character {
	private String surname;
	public Warrior(String name) {
		super(name);
	}
	public Warrior(String name, String surname) {
		super(name);
		this.surname = surname;	

	}
	public void disBonjour() {
		super.disBonjour();
		System.out.println(this.getName() + " : Je suis un guerrier!");
	}
}
