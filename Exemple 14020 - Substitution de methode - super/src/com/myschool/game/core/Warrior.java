// Fichier Warrior.java
package com.myschool.game.core;
public class Warrior extends Character{
	int liveScore = 10;
	public void disBonjour() {
//		System.out.println(this.name + " : Bonjour tout le monde! ");
		super.disBonjour();
		System.out.println(this.name + " : Je suis un guerrier!");
   }
}
