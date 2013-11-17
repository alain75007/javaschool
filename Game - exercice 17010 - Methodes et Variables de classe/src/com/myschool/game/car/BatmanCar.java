package com.myschool.game.car;

public class BatmanCar extends Car {
	public boolean vole;

	@Override
	public void demarrer() {
		super.demarrer();
		this.vroomvroom();
		
	}
	

	/*@Override
	public void initialize(String proprietaire, String couleur, int puissance, boolean decapotable) {
		couleur = "noire";
		super.initialize(proprietaire, couleur, puissance, decapotable);
	}*/


	public BatmanCar(String proprietaire, String couleur, int puissance,
			boolean decapotable) {
		super(proprietaire, "noir", puissance, decapotable);
		// TODO Auto-generated constructor stub
	}

	public BatmanCar(String proprietaire, String couleur, int puissance) {
		super(proprietaire, "noir", puissance);
		// TODO Auto-generated constructor stub
	}


	public void vole() {
		if (this.isEst_demarre()) {  
		print("La voiture de " + this.proprietaire + " vole!");
		this.vole = true;
		}
	}
}
