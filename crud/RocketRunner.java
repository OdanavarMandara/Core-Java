package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class RocketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rocket rocket = new Rocket();
		String name = rocket.getName();
		System.out.println(name);

		rocket.addLocation("bangalore");
		rocket.addLocation("goa");
		rocket.addLocation("karwar");
		rocket.addLocation("pune");

		rocket.displayLocation();

	}

}
