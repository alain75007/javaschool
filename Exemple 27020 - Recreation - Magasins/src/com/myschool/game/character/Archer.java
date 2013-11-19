package com.myschool.game.character;

public class Archer extends Character implements Fight{
	int munitionLeft = munitionCount;

	public Archer(String name, int liveScore) {
		super(name, liveScore);
	}

	@Override
	public void useWeapon(Character target) {
		this.prepareWeapon();
		munitionLeft = munitionLeft - 1;
		this.write(target);
	}

	@Override
	public void write(Character target) {
		System.out.println(this.getName() + " a tiré une flèche vers "  + target.getName());
	}

	@Override
	public void prepareWeapon() {
		System.out.println(this.getName() + " retire une flèche de son carquois");
	}

	
}
