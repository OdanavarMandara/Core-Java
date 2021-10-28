package com.xworkz.dp.Dto;

public class MetroStationDTO {
	
	private String name;
	private String route;
	private int openTime;
	private int closeTime;
	
	public MetroStationDTO()
	{
		
	}
	
	

	public MetroStationDTO(String name, String route,int openTime, int closeTime) {
		super();
		this.name = name;
		this.route = route;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getOpenTime() {
		return openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}

	public int getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
	
	
	
	

}



