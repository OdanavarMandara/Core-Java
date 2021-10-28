package com.xworkz.dp.Dto;

public class ClubDTO {
	
	private int noOfPeople;
	private int noOfBottle;
	private float ratings;
	private int entryPrice;
	private int noOfStaff;
	
	public ClubDTO()
	{
		
	}

	public ClubDTO(int noOfPeople, int noOfBottle, float ratings, int entryPrice, int noOfStaff) {
		super();
		this.noOfPeople = noOfPeople;
		this.noOfBottle = noOfBottle;
		this.ratings = ratings;
		this.entryPrice = entryPrice;
		this.noOfStaff = noOfStaff;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public int getNoOfBottle() {
		return noOfBottle;
	}

	public void setNoOfBottle(int noOfBottle) {
		this.noOfBottle = noOfBottle;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(int entryPrice) {
		this.entryPrice = entryPrice;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	
	
}
