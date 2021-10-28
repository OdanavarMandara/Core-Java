package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class BraceletStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bracelet bracelet = new Bracelet();
		bracelet.setColor("red");
		bracelet.setPrice(70.1f);
		bracelet.setMaterial("gold");
		bracelet.setGemused(true);
		bracelet.setGifted(false);

		Bracelet bracelet2 = new Bracelet("red", 9.7f, "plastic", true, false);
		Bracelet bracelet3 = new Bracelet("gold", 15, "plastic", true, false);
		Bracelet bracelet4 = new Bracelet("silver", 15, "plastic", true, false);
		Bracelet bracelet5 = new Bracelet("blue", 15, "plastic", true, false);

		Bracelet[] fig = new Bracelet[5];
		fig[0] = bracelet;
		fig[1] = bracelet3;
		fig[4] = bracelet5;
		for (int lock = 0; lock < fig.length; lock++) {
			Bracelet ref = fig[lock];
			if (ref != null) {

				System.out.println(ref.getColor());
				System.out.println(ref.getPrice());
				System.out.println(ref.getMaterial());
				System.out.println(ref.isGemused());
				System.out.println(ref.isGifted());
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(lock)));
			}
		}

	}

}
