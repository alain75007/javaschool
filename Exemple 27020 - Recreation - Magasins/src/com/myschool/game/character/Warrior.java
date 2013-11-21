// Fichier Warrior.java
package com.myschool.game.character;
public class Warrior extends Character {
	@Override
	public void hello() {
		super.hello();
		//System.out.println("Je suis un guerrier!");
	}

	public Warrior(String name, int liveScore) {
		super();
		//super(name, liveScore);
		//System.out.println("Constructeur surchargé de warrior");

	}
}
