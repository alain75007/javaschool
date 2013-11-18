// Fichier Game.java
package com.myschool.game.core;
public class Game {

	public static void main(String[] args) {
		int playerCount = 0;
        Character character1   = new Character();
        Character character2 = new Warrior();
        character1.name = "Maxime";
        playerCount++;
        character2.name = "Alpha";
        playerCount++;
        System.out.println("Nombre de personnages : " + playerCount);
        character2.disBonjour();
        character1.disBonjour(character2); 
	}
}