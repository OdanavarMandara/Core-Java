package com.xworkz.dp;

import com.xworkz.dp.dto.*;

public class ElevatorStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elevator elevator=new Elevator();
		elevator.setType("aaa");
		elevator.setPrice(200.23f);
		
		
		
		Elevator elevator2 = new Elevator("bbb",203.33f);
		Elevator elevator3 = new Elevator("ccc",303.4f);
		
		Elevator[] b = new Elevator[3];
		b[0] = elevator;
		b[1] = elevator2;
		b[2] = elevator3;
		
		for (int  i= 0; i < b.length; i++) {
			Elevator ref = b[i];
			if (ref != null) {

				System.out.println(ref.getType());
				System.out.println(ref.getPrice());
				
				
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(i)));
			}
		}


	}

}
