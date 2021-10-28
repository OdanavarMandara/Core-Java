package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class WaterFallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterFall waterfall = new WaterFall();
		String name = waterfall.getLocation();
		System.out.println(name);

		waterfall.addWaterfallName("jog");
		waterfall.addWaterfallName("dudhsagar");
		waterfall.addWaterfallName("angel");
		waterfall.addWaterfallName("niagara");
		waterfall.addWaterfallName("victoria");
		waterfall.displaywaterfallname();
	}

}
