package com.xworkz.dp.dto;

public class ParkDTO {
	
	private String name;
	private String location;
	private float acres;
	private boolean watchman;
	private String type;
	
	public ParkDTO()
	{
		
	}
	
	

	public ParkDTO(String name, String location, float acres, boolean watchman, String type) {
		super();
		this.name = name;
		this.location = location;
		this.acres = acres;
		this.watchman = watchman;
		this.type = type;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getAcres() {
		return acres;
	}

	public void setAcres(float acres) {
		this.acres = acres;
	}

	public boolean isWatchman() {
		return watchman;
	}

	public void setWatchman(boolean watchman) {
		this.watchman = watchman;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
