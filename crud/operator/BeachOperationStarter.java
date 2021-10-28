package com.xworkz.crud.operator;

public class BeachOperationStarter {
	private String country;
	private String[] beachNames = new String[5];
	private int counter = 0;

	public BeachOperationStarter () {
		this("India");
		System.out.println("Invoked BeachStarter no-arg const");
	}

	public BeachOperationStarter (String country) {
		this.country = country;
		System.out.println("Invoked BeachStarter string const");
	}
	
	public String getCountry()
	{
		return this.country;
	}

	public void addBeach(String name) {
		System.out.println("Invoked addBeachName");
		System.out.println("Name arg : ".concat(name));
		if (this.counter < 5) {
			this.beachNames[this.counter] = name;
			this.counter++;
		} else 
		{
			System.out.println("array is full, cannot add go do what ever you want");

		}
	}

	public void displayBeachNames() {
		System.out.println("invoked displayBeachNames");
		for (int i = 0;i < this.beachNames.length;i++) {
			String name = this.beachNames[i];
			System.out.println(name);
		}
	}

}


