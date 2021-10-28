package com.xworkz.crud.operator;

public class WaterFall {

	private String location;
	private String[] waterfallName = new String[5];
	private int counter = 0;

	public WaterFall() {
		this("aaa");
		System.out.println("invoked waterfall no-arg const");
	}

	public WaterFall(String location) {
		this.location = location;
		System.out.println("invoked waterfall string const");
	}

	public String getLocation() {
		return this.location;
	}

	public void addWaterfallName(String name) {
		System.out.println("invoked addwaterfallname");
		System.out.println("Name arg:".concat(name));
		if (this.counter < 5) {
			this.waterfallName[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array is full");
		}
	}

	public void displaywaterfallname() {
		System.out.println("invoked displaywaterfallname");
		for (int i = 0; i < this.waterfallName.length; i++) {
			String n = this.waterfallName[i];
			System.out.println(n);
		}
	}

}
