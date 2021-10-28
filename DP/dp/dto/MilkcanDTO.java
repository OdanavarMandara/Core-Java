package com.xworkz.dp.Dto;
import com.xworkz.dp.Constants.*;
public class MilkcanDTO {
	
	private String quantity;
	private String shape;
	private Quality quality;
	private String color;
	private int price;
	
	public MilkcanDTO()
	{
		
	}
	
	

	public MilkcanDTO(String quantity, String shape, Quality quality, String color, int price) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.quality = quality;
		this.color = color;
		this.price = price;
	}



	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
