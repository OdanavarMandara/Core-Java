package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class CraneStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Crane crane = new Crane();
		crane.setCranCapacity(34.8f);
		crane.setCraneName("aaa");
		crane.setCraneType("xyz");
		crane.setWeight(40);
		
		
		Crane crane2 = new Crane(30.3f,"bbb","bb",50);
		Crane crane3 = new Crane(40.4f,"ccc","cc",60);
		Crane crane4 = new Crane(50.5f,"ddd","dd",70);
		Crane crane5 = new Crane(60.6f,"eee","ee",80);

		Crane[] b = new Crane[5];
		b[0] = crane;
		b[1] = crane2;
		b[4] = crane5;
		for (int  i= 0; i < b.length; i++) {
			Crane ref = b[i];
			if (ref != null) {

				System.out.println(ref.getCranCapacity());
				System.out.println(ref.getCraneName());
				System.out.println(ref.getCraneType());
				System.out.println(ref.getWeight());
				
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(i)));
			}
		}


	}

}
