package com.xworkz.crud.operator;

public class Gin {

	private String name;
	private String[] brands = new String[5];
	private int counter = 0;

	public Gin() {
		this("nnn");
		System.out.println("invoked Gin no-arg const");
	}

	public Gin(String name) {
		this.name = name;
		System.out.println("invoked Gin string const");
	}

	public String getName() {
		return this.name;
	}

	public void addBrands(String name) {
		System.out.println("invoked addBrands");
		System.out.println("Name arg:".concat(name));
		if (this.counter < 5) {
			this.brands[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array is full");
		}
	}

	public void displayBrands() {
		System.out.println("invoked displayBrands");
		for (int i = 0; i < this.brands.length; i++) {
			String n = this.brands[i];
			System.out.println(n);
		}
	}
}
