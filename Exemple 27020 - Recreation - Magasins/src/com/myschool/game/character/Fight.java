package com.myschool.game.character;

public interface Fight {
	public  int munitionCount = 10;
	
	void useWeapon(Character target);
	void prepareWeapon();
	void write(Character target);
}
