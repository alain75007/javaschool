// Fichier Game.java
package com.myschool.game.core;
public class Game {
	public static void main(String[] args) {
        Character character1   = new Character();
        Character character2 = new Character();
        character1.name = "Maxime";
        character2.name = "Alpha";
        System.out.println("Moi, " + character2.name + "!, j'ai " + character2.liveScore + " points de vie!");
	}
}

