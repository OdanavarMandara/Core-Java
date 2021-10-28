package com.xworkz.dp.Dto;

public class CircusDTO {
	
	private String owner;
	private int ticketPrice;
	private int noOfAnimals;
	private int noOfShows;
	private int duration;
	
	public CircusDTO()
	{
		
	}
	
	

	public CircusDTO(String owner, int ticketPrice, int noOfAnimals, int noOfShows, int duration) {
		super();
		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.duration = duration;
	}



	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
