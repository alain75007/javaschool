package com.myschool.game.car;

public class Car {
	private String couleur;
	private int puissance;
	private boolean est_demarre;
	boolean decapotable;
	String proprietaire;
	private static int carCount;
	
	public static int getCarCount() {
		return carCount;
	}

	public Car(String proprietaire, String couleur, int puissance) {
		this.initialize(proprietaire, couleur, puissance);

	}

	public Car(String proprietaire, String couleur, int puissance,
			boolean decapotable) {
		this.initialize(proprietaire, couleur, puissance, decapotable);
	}

	public void initialize(String proprietaire, String couleur, int puissance) {
		carCount++;
		this.proprietaire = proprietaire;
		this.couleur = couleur;
		this.puissance = puissance;
		System.out.println("intialize 1");
	}

	public void initialize(String proprietaire, String couleur, int puissance, boolean decapotable) {
		initialize(proprietaire, couleur, puissance);
		this.decapotable = decapotable;
		System.out.println("intialize 2");
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isDecapotable() {
		return decapotable;
	}

	public void setDecapotable(boolean decapotable) {
		this.decapotable = decapotable;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	static public void print(String message) {
		System.out.println(message);
	}

	public void demarrer() {
		setEst_demarre(true);
		System.out.println("La voiture de " + proprietaire + " demarre...");
	}

	public void vroomvroom() {
		if (isEst_demarre()) {
			System.out.println("La voiture de " + proprietaire
					+ " fait Vroom! Vroom!");
		}
	}

	public boolean isEst_demarre() {
		return est_demarre;
	}

	public void setEst_demarre(boolean est_demarre) {
		this.est_demarre = est_demarre;
	}
}
