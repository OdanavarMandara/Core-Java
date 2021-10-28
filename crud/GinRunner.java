package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class GinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gin gin=new Gin();
		String name=gin.getName();
		System.out.println(name);
		
		gin.addBrands("brand1");
		gin.addBrands("brand2");
		gin.addBrands("brand3");
		gin.addBrands("brand4");
		gin.addBrands("brand5");
		gin.displayBrands();
	}
	}


