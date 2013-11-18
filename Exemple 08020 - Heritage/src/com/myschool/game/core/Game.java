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
        System.out.println("La classe de character1 est " + character1.getClass());
        System.out.println("La classe de character2 est " + character2.getClass());
        System.out.println("character1.toString() renvoie " + character2.toString());
        System.out.println("character1.hashCode() renvoie " + character2.hashCode());
        System.out.println("character1.equals(character2) renvoie " + character1.equals(character2));
	}
}