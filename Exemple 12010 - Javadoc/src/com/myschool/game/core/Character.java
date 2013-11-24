//Fichier Character.java
package com.myschool.game.core;

/**
 * Classe personnage. Utilis�e comme superclasse de personnages typ�es comme {@link Warrior} ou {@link Archer}.
 */
public class Character {
	String name;
	/**
	 * Nombre de points de vie d'un personnage
	 *  
	 */
	int liveScore;
	
	/**
	 * Met-à-jour le nombre de points de vie ({@link liveScore}) d'un personnage
	 * ({@link Character}).
	 * <p>
	 * Un personnage peut perdre ou gagner des points de vie. Il perd des points
	 * de vie s'il subit des blessures. Il en regagne si ces blessures se
	 * soignent avec le temps ou à l'aide de soins adéquats.
	 * 
	 * @param liveScore un numérique indiquant le nb de pdv.
	 * @return void
	 * @see Character
	 */
	public void setLiveScore(int liveScore) {
		this.liveScore = liveScore;
   }
	public void disBonjour(Character character) {
		System.out.println(this.name + ": Bonjour " + character.name + "!");
   }
	public void disBonjour() {
		System.out.println(this.name + ": Bonjour tout le monde!");
   }
}
