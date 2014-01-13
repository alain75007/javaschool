// Fichier Game.java
package com.myschool.game.core;

public class Game {

	public static void main(String[] args) {
		Character character1 = new Character();
		Character character2 = new Character();
		System.out.println("character1 equals character2 : "
				+ character1.equals(character2));
	}
}
