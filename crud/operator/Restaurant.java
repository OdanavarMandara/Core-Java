package com.xworkz.crud.operator;

public class Restaurant {

	private String location;
	private String[] restaurantName = new String[4];
	private int counter = 0;

	public Restaurant() {
		this("Bangalore");
		System.out.println("invoked restaurant no-arg const");
	}

	public Restaurant(String location) {
		this.location = location;
		System.out.println("invoked restaurant string const");
	}

	public String getLocation() {
		return this.location;
	}

	public void addlocation(String name) {
		System.out.println("invoked addlocation");
		System.out.println("Name arg:".concat(name));
		if (this.counter < 4) {
			this.restaurantName[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array is full");
		}
	}

	public void displayRestaurantName() {
		System.out.println("invoked displayRestaurantname");
		for (int i = 0; i < this.restaurantName.length; i++) {
			String n = this.restaurantName[i];
			System.out.println(n);
		}
	}

}
