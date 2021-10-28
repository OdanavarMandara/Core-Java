package com.xworkz.crud.operator;

public class Island {

	private String location;
	private String[] islandName = new String[4];
	private int counter = 0;

	public Island() {
		this("aaa");
		System.out.println("invoked island no-arg const");
	}

	public Island(String location) {
		this.location = location;
		System.out.println("invoked island string const");
	}

	public String getlocation() {
		return this.location;
	}

	public void addIslandName(String name) {
		System.out.println("invoked addislandnames");
		System.out.println("Name arg:".concat(name));
		if (this.counter < 4) {
			this.islandName[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array is full");
		}
	}

	public void displayIslandName() {
		System.out.println("invoked displayislandname");
		for (int i = 0; i < this.islandName.length; i++) {
			String n = this.islandName[i];
			System.out.println(n);
		}
	}

}
