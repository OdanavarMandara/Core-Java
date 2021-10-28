package com.xworkz.crud.operator;

public class Rocket {

	private String name;
	private String[] location = new String[5];
	private int counter = 0;

	public Rocket () {
		this("India");
		System.out.println("Invoked Rocket no-arg const");
	}

	public Rocket (String name) {
		this.name = name;
		System.out.println("Invoked Rocket string const");
	}
	
	public String getName()
	{
		return this.name;
	}

	public void addLocation(String name) {
		System.out.println("Invoked addlocation");
		System.out.println("Name arg : ".concat(name));
		if (this.counter < 5) {
			this.location[this.counter] = name;
			this.counter++;
		} else 
		{
			System.out.println("array is full, cannot add go do what ever you want");

		}
	}

	public void displayLocation() {
		System.out.println("invoked displayLocation");
		for (int i = 0;i < this.location.length;i++) {
			String name = this.location[i];
			System.out.println(name);
		}
	}

}
