package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class ChocolateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateOperationStarter choco = new ChocolateOperationStarter();
		String name = choco.getName();
		System.out.println(name);

		choco.addFlavours("cream");
		choco.addFlavours("choco");
		choco.addFlavours("nuts");
		choco.addFlavours("fruits");
		choco.addFlavours("strawberry");
		choco.displayFlavours();

	}

}
