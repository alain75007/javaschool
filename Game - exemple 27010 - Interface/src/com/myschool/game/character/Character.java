// Fichier Character Jav
package com.myschool.game.character;

public class Character {
	private int liveScore = 10; // private => visible uniquement dans
								// Character
	
	private String name;
	

	public String getName() {
		return name;
	}

	// Constructeur
	public Character() {
		//super();
		System.out.println("Nouveau personnage.");
		this.hello();
		// TODO Auto-generated constructor stub
	}
	
	public Character(int liveScore) {
		this.liveScore = liveScore;
	}

	public Character(String name, int liveScore) {
		this(liveScore);
		this.name = name;
		System.out.println("Constructeur avec arg name");
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
