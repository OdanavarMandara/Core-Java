package com.xworkz.dp.Dto;
import com.xworkz.dp.Constants.*;

public class BucketDTO {
	
	private String color;
	private Size1 size;
	private float price;
	private int quantity;
	private float weight;
	private String company;
	
	public BucketDTO()
	{
	}
	
	

	public BucketDTO(String color, Size1 size, float price, int quantity, float weight, String company) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
		this.company = company;
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Size1 getSize() {
		return size;
	}

	public void setSize(Size1 size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	}


