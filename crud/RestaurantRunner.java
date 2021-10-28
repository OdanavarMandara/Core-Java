package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class RestaurantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant res = new Restaurant();
		String name = res.getLocation();
		System.out.println(name);

		res.addlocation("cave-dine");
		res.addlocation("aaa");
		res.addlocation("bb");
		res.addlocation("mm");
		res.displayRestaurantName();
	}

}
