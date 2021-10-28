package com.xworkz.dp.dto;

public class ArmyDTO {
	
	private String country;
	private int noOfSoldiers;
	private int noOfWorkers;
	private String typesOfWeapon;
	private int noOfCarrier;
	
	public ArmyDTO()
	{
		
	}

	public ArmyDTO(String country, int noOfSoldiers, int noOfWorkers, String typesOfWeapon, int noOfCarrier) {
		super();
		this.country = country;
		this.noOfSoldiers = noOfSoldiers;
		this.noOfWorkers = noOfWorkers;
		this.typesOfWeapon = typesOfWeapon;
		this.noOfCarrier = noOfCarrier;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public String getTypesOfWeapon() {
		return typesOfWeapon;
	}

	public void setTypesOfWeapon(String typesOfWeapon) {
		this.typesOfWeapon = typesOfWeapon;
	}

	public int getNoOfCarrier() {
		return noOfCarrier;
	}

	public void setNoOfCarrier(int noOfCarrier) {
		this.noOfCarrier = noOfCarrier;
	}
	
	

}
