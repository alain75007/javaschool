// Fichier Character Jav
package com.myschool.game.character;

public class Character {
	private int liveScore = 10; // private => visible uniquement dans
								// Character

	// Constructeur
	public Character() {
		System.out.println("Nouveau personnage.");
		this.hello();
		// TODO Auto-generated constructor stub
	}


	public void hello() {
		System.out.println("Bonjour!");
	}

	public int getLiveScore() {
		return liveScore;
	}

	public void setLiveScore(int liveScore) {
		this.liveScore = liveScore; // Voir l’utilisation de this § 6.1
	}
}
