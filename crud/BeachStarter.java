package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class BeachStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeachOperationStarter beachOperator = new BeachOperationStarter();
		String country = beachOperator.getCountry();
		System.out.println(country);

		beachOperator.addBeach("malpe beach");
		beachOperator.addBeach("karwar beach");
		beachOperator.addBeach("baga beach");
		beachOperator.addBeach("om beach");
		beachOperator.addBeach(" beach");
		beachOperator.displayBeachNames();

	}

}
