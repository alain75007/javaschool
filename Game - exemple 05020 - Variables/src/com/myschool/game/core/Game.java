// Fichier Game.java
package com.myschool.game.core;
public class Game {

	public static void main(String[] args) {
		int characterCount = 0;
        Character character1   = new Character();
        characterCount++;
        character1.name = "Maxime";        
        Character character2 = new Character();
        characterCount++;     
        character2.name = "Alpha";
        System.out.println("Nombre de personnages : " + characterCount);
	}
}

