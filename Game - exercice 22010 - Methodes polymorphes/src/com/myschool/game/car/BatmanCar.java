package com.myschool.game.car;

public class BatmanCar extends Car {
	public boolean vole;
	private  final String carType = "Voiture de batman";

	public boolean isVole() {
		return vole;
	}

	public String getCartype() {
		return carType;
	}


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
		print("La voiture de " + this.getProprietaire() + " vole!");
		this.vole = true;
		}
	}
}
