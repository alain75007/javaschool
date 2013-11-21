// Fichier Game.java
package com.myschool.game.core;
public class Game {
	public static void main(String[] args) {
		int CharacterCount = 0;
        Character character1   = new Character();
        character1.name = "Maxime";
        CharacterCount++;
        Character character2 = new Warrior();
        character2.name = "Alpha";
        CharacterCount++;
        System.out.println("Nombre de personnages : " + CharacterCount);
        character2.disBonjour();
        character1.disBonjour(character2);
        System.out.println("La classe de character1 est " + character1.getClass());
        System.out.println("La classe de character2 est " + character2.getClass());
        System.out.println("character1.toString() renvoie " + character2.toString());
        System.out.println("character1.hashCode() renvoie " + character2.hashCode());
        System.out.println("character1.equals(character2) renvoie " + character1.equals(character2));
	}
}