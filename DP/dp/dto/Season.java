package com.xworkz.dp.dto;

public class Season {
	
	private String name;
	private String month;
	
	public Season()
	{
	}
	
	

	public Season(String name, String month) {
		super();
		this.name = name;
		this.month = month;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	
	}


