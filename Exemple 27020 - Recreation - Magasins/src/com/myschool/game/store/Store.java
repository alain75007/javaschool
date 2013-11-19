package com.myschool.game.store;

public class Store {
	String name;
	private Product[] products = new Product[3];
	
	public Store(String name, Product[] products) {
		this.name = name;
		this.products = products;
		System.out.println("Nouveau magasin " + name);
	}
	public void listProducts() {
		for(Product product : products) {
			System.out.println(this.name + " vend "  + product.getName() + ", prix : " + product.getPrice() + '€');
			
		}
	}
	

}
