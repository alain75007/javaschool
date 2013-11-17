package com.myschool.game.car;

public class Game {
  public static void main(String[] args) {
	  System.out.println("Car Game lancée !");
	  //Car voiture1 = new Car();
	  Car voiture1 = new Car("Maxime", "rouge", 10);
	  //BatmanCar voiture2 = new BatmanCar();
	  BatmanCar voiture2 = new BatmanCar("Maëlis", "bleue", 11, true);
/*	  voiture1.initialize("Maxime", "rouge", 10);
	  voiture2.initialize("Maëlis", "bleu", 11, true);*/
	  voiture2.demarrer();
	  //voiture2.vroomvroom();
	  voiture2.vole();
	  voiture2.setEst_demarre(false);
	  System.out.println("Nb Car " + Car.getCarCount());
  }
}
