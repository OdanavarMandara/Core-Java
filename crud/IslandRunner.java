package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class IslandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Island island = new Island();
		String name = island.getlocation();
		System.out.println(name);

		island.addIslandName("maldives");
		island.addIslandName("bali");
		island.addIslandName("palawan");
		island.addIslandName("santorini");

		island.displayIslandName();

	}

}
