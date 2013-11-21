// Fichier Game.java
package com.myschool.game.core;
import com.myschool.game.character.Archer;
import com.myschool.game.character.Knight;
import com.myschool.game.character.Warrior;
import com.myschool.game.store.Product;
import com.myschool.game.store.Store;
public class Game {
	public static void main(String[] args) {
		Warrior warrior1 = new Warrior("Kévin", 11);
		//warrior1.hello();
		warrior1.setLiveScore(9);
		System.out.println("J'ai " + warrior1.getLiveScore()
				+ " points de vie.");
		Archer archer1 = new Archer("Maxime", 10);
		Knight knight1 = new Knight("Bastien", 10);
		archer1.useWeapon(knight1);
		knight1.useWeapon(archer1);
		Product[] products= new Product[3];
		products[0]  = new Product("Antibiotic", 10);
		products[1] = new Product("Vitamines", 15);
		products[2]  = new Product("Onguent", 20);
		Store store1 = new Store("Pharmacie Bastien", products);
		store1.listProducts();
	}
}
