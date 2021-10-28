package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resort resort = new Resort();
		String name = resort.getLocation();
		System.out.println(name);

		resort.addResort("aa");
		resort.addResort("kk");
		resort.addResort("hh");
		resort.addResort("mm");
		resort.addResort("dd");
		resort.displayResortNames();
	}

}
