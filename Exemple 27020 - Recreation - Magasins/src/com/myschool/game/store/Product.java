package com.myschool.game.store;

public class Product {
	public int getPrice() {
		return price;
	}
	private int price;
	public String getName() {
		return name;
	}
	private String name;	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
