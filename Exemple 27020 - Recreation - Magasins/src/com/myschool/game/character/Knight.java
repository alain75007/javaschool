package com.myschool.game.character;

public class Knight extends Warrior implements Fight {
	int munitionsLeft = 1;

	public Knight(String name, int liveScore) {
		super(name, liveScore);
	}

	@Override
	public void useWeapon(Character target) {
		this.prepareWeapon();
		this.write(target);
	}
	

	@Override
	public void write(Character target) {
		System.out.println(this.getName() + " a donné un coup d'épée à " + target.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareWeapon() {
		System.out.println(this.getName() + " retire son épée de son étui!");
		
	}

}
