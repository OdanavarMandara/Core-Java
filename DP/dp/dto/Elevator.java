package com.xworkz.dp.dto;

public class Elevator {
	
	private String type;
	private float price;
	
	public Elevator()
	{
	}
	
	public Elevator(String type, float price) {
		super();
		this.type = type;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
