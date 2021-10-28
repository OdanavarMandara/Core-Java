package com.xworkz.crud.operator;

public class UpdateDeleteOperation {

	private String[] brandName = new String[7];
	private String[] labourName = new String[8];
	private String[] coffee = new String[8];
	private String[] airport = new String[8];
	private String[] stadium = new String[8];

	private int a;

	public void addCoolDrinks(String name) {
		System.out.println("CoolDrinks: ".concat(name));
		if (this.a < brandName.length) {
			this.brandName[this.a++] = name;
		}

		else {
			System.err.println("coolDrinks array is full");
		}
	}

	public void displayCoolDrinks() {
		for (int i = 0; i < brandName.length; i++) {
			System.out.println(brandName[i]);
		}

		System.out.println("------------------------");

	}

	public void deleteCoolDrinks(int jalebi) {
		if (jalebi >= 0 && jalebi < brandName.length) {	
			this.brandName[jalebi] = null;
		} else {
			System.out.println("cannot Delete");

		}
	}

	public void updateCoolDrinks(int jamoon, String ref) {
		System.out.println("update String");
		if (jamoon >= 0 && jamoon < brandName.length) {
			this.brandName[jamoon] = ref;
		} else {
			System.out.println("cannot upadate");
		}
	}

	public void addLabourName(String name) {
		System.out.println("Labour Name:".concat(name));
		if (this.a < labourName.length) {
			this.labourName[this.a++] = name;

		} else {
			System.err.println("Labour Array is full");
		}
	}

	public void displayLabourName() {
		for (int i = 0; i < labourName.length; i++) {
			System.out.println(labourName[i]);
		}

		System.out.println("---------------------------");
	}

	public void deleteLabourName(int good) {
		if (good >= 0 && good < labourName.length) {
			this.brandName[good] = null;
		} else {
			System.out.println("---------------------------------");

		}
	}
	

	public void addCoffee(String name) {
		System.out.println("coffee:".concat(name));
		if (this.a < coffee.length) {
			this.coffee[this.a++] = name;

		} else {
			System.err.println("coffee Array is full");
		}
	}

	public void displayCoffee()

	{
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}

		System.out.println("------------------------");
	}

	public void deletecoffe(int cof) {
		if (cof >= 0 && cof < coffee.length) {
			this.coffee[cof] = null;
		} else {
			System.out.println("cont delete");

		}
	}

	public void updatecoffee(int i, String j) {
		System.out.println("update String");
		if (i >= 0 && i < coffee.length) {
			this.coffee[i] = j;
		} else {
			System.out.println("cannot upadate");
		}
	}

	public void addAirPort(String name) {
		System.out.println("Airport Name:".concat(name));
		if (this.a < airport.length) {
			this.airport[this.a++] = name;

		} else {
			System.err.println("airport Array is full");
		}
	}

	public void displayairport()

	{
		for (int i = 0; i < airport.length; i++) {
			System.out.println(airport[i]);
		}

		System.out.println("------------------------------");
	}

	public void deleteairport(int air) {
		if (air >= 0 && air < airport.length) {
			this.airport[air] = null;
		} else {
			System.out.println("can not delete");

		}
	}

	public void updateairport(int air, String ref) {
		System.out.println("update String");
		if (air >= 0 && air < airport.length) {
			this.airport[air] = ref;
		} else {
			System.out.println("cannot upadate");
		}
	}

	public void addstadium(String name)
	{
		System.out.println("stadium:".concat(name));
		if (this.a < stadium.length) {
			this.stadium[this.a++] = name;

		} else {
			System.err.println("stadium Array is full");
		}
	}

	public void displaystadium()

	{
		for (int i = 0; i < stadium.length; i++) {
			System.out.println(stadium[i]);
		}

		System.out.println("-------------------------------");
	}

	public void deletestadium(int std) {
		if (std >= 0 && std < stadium.length) {
			this.stadium[std] = null;
		} else {
			System.out.println("can not delete");

		}
	}

	public void updatestadium(int std, String ref) {
		System.out.println("update String");
		if (std >= 0 && std < stadium.length) {
			this.stadium[std] = ref;
		} else {
			System.out.println("cannot upadate");
		}
	}

}
