package com.xworkz.dp.dto;

public class Bracelet {

	private String color;
	private float price;
	private String material;
	private boolean gemused;
	private boolean gifted;

	public Bracelet() {
		System.out.println("default const");
	}

	public Bracelet(String color, float price, String material, boolean gemused, boolean gifted) {
		this.color = color;
		this.price = price;
		this.material = material;
		this.gemused = gemused;
		this.gifted = gifted;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGemused() {
		return gemused;
	}

	public void setGemused(boolean gemused) {
		this.gemused = gemused;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

}
