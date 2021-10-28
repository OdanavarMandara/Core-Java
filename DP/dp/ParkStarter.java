package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class ParkStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParkDTO park=new ParkDTO();
		park.setName("aaa");
		park.setLocation("bangalore");
		park.setAcres(2000f);
		park.setWatchman(true);
		park.setType("ttt");
		
		ParkDTO park2 = new ParkDTO("p1","mysore",300,false,"t1");
		ParkDTO park3 = new ParkDTO("p2","mysore",300,true,"t2");
		ParkDTO park4 = new ParkDTO("p3","mysore",300,false,"t3");
		ParkDTO park5 = new ParkDTO("p4","mysore",300,false,"t4");

		ParkDTO[] p = new ParkDTO[5];
		p[0] = park;
		p[1] = park3;
		p[4] = park5;
		for (int d = 0; d < p.length; d++) {
			ParkDTO ref =p[d];
			if (ref != null) {

				System.out.println(ref.getName());
				System.out.println(ref.getLocation());
				System.out.println(ref.getAcres());
				System.out.println(ref.isWatchman());
				System.out.println(ref.getType());
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(d)));
			}
		}
		
		
		
		


	}

}
