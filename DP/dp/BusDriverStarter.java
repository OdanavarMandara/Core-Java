package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class BusDriverStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusDriver busdriver = new BusDriver();
		busdriver.setName("aa");
		busdriver.setAge(30);
		busdriver.setId(89);
		busdriver.setExperiance("2yrs");
		busdriver.setSalary(20000);
		busdriver.setShift(false);
		
		BusDriver busdriver2 = new BusDriver("bb",26,90,"3yrs",25000,true);
		BusDriver busdriver3 = new BusDriver("cc",30,70,"4yrs",30000,true);
		BusDriver busdriver4 = new BusDriver("dd",40,60,"5yrs",35000,true);
		BusDriver busdriver5 = new BusDriver("ee",50,30,"6yrs",40000,true);

		BusDriver[] b = new BusDriver[5];
		b[0] = busdriver;
		b[1] = busdriver2;
		b[4] = busdriver5;
		for (int  i= 0; i < b.length; i++) {
			BusDriver ref = b[i];
			if (ref != null) {

				System.out.println(ref.getName());
				System.out.println(ref.getAge());
				System.out.println(ref.getId());
				System.out.println(ref.getExperiance());
				System.out.println(ref.getSalary());
				System.out.println(ref.isShift());
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(i)));
			}
		}

	}

}
