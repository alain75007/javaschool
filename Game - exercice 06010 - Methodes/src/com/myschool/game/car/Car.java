// Fichier Car.java
package com.myschool.game.car;

public class Car {
	String couleur;
	int puissance;
	boolean demarree = false;
	String proprietaire;
	
	public void initialize(String proprietaire, String couleur, int puissance) {
		this.couleur = couleur;
		this.proprietaire = proprietaire;
		this.puissance = puissance;
	}
}
