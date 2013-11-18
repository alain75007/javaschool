// Fichier Start.java
package com.myschool.game.car;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Car Game lancé!");
		Car car1 = new Car();
		car1.initialize("Maxime", "rouge", 10);
		Car car2 = new Car();
		car2.initialize("Maëlis", "bleu", 11);
	}

}
