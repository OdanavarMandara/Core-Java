package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class SeasonStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Season season = new Season();
		season.setName("winter");
		season.setMonth("December");

		Season season2 = new Season("rainy", "june");
		Season season3 = new Season("summer", "march");

		Season[] b = new Season[3];
		b[0] = season;
		b[1] = season2;
		b[2] = season3;
		for (int i = 0; i < b.length; i++) {
			Season ref = b[i];
			if (ref != null) {

				System.out.println(ref.getName());
				System.out.println(ref.getMonth());

			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(i)));
			}
		}

	}

}
