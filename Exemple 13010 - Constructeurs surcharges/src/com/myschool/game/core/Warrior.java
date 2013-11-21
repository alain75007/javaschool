// Fichier Warrior.java
package com.myschool.game.core;
public class Warrior extends Character {
/*	public Warrior() {
		super();
		System.out.println("Nouveau guerrier");
	}*/
	public Warrior(String name) {
			super(name);
	}
	public void disBonjour() {
		// System.out.println(this.name + " : Bonjour tout le monde! ");
		super.disBonjour();
		System.out.println(this.getName() + " : Je suis un guerrier!");
	}
}
