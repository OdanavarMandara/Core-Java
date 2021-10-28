package com.xworkz.crud.operator;

public class Resort {

	private String location;
	private String[] resortName = new String[5];
	private int counter = 0;

	public Resort() {
		this("aaa");
		System.out.println("invoked resort no-arg const");
	}

	public Resort(String location) {
		this.location = location;
		System.out.println("invoked resort string const");
	}

	public String getLocation() {
		return this.location;
	}

	public void addResort(String name) {
		System.out.println("invoked addResortnames");
		System.out.println("Name arg:".concat(name));
		if (this.counter < 5) {
			this.resortName[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array is full");
		}
	}

	public void displayResortNames() {
		System.out.println("invoked displayresortnames");
		for (int i = 0; i < this.resortName.length; i++) {
			String n = this.resortName[i];
			System.out.println(n);
		}
	}

}
