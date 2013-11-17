// Fichier Game.java
package com.myschool.game.core;
import com.myschool.game.character.Warrior;
public class Game {
	public static void main(String[] args) {
		Warrior warrior1 = new Warrior("KŽvin", 11);
		//warrior1.hello();
		warrior1.setLiveScore(9);
		System.out.println("J'ai " + warrior1.getLiveScore()
				+ " points de vie.");

	}
}
