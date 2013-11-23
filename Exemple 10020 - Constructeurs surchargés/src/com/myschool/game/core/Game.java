// Fichier Game.java
package com.myschool.game.core;
public class Game {

	public static void main(String[] args) {
		int CharacterCount = 0;
        Character character1   = new Character("Maxime");
        //character1.setName("Maxime");
        character1.setLiveScore(10);
        CharacterCount++;
        Character character2 = new Character("Alpha");
        // character2.setName("Alpha");
        character2.setLiveScore(11);
        CharacterCount++;
        System.out.println("Nombre de personnages : " + CharacterCount);
        character1.disBonjour(); 
        character1.disBonjour(character2);
        System.out.println(character2.getName() + " : j'ai " + character2.getLiveScore() + " points de vie!");
	}
}

