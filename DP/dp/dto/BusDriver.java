package com.xworkz.dp.dto;

public class BusDriver {
	
	private String name;
	private int age;
	private int id;
	private String experiance;
	private float salary;
	private boolean shift;
	
	public BusDriver()
	{
		
	}
	

	public BusDriver(String name, int age, int id, String experiance, float salary, boolean shift) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.experiance = experiance;
		this.salary = salary;
		this.shift = shift;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExperiance() {
		return experiance;
	}

	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isShift() {
		return shift;
	}

	public void setShift(boolean shift) {
		this.shift = shift;
	}
	
	

}
