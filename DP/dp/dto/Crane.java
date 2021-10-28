package com.xworkz.dp.dto;

public class Crane {
	
	private float cranCapacity;
	private String craneName;
	private String craneType;
	private float weight;
	
	public Crane()
	{
	}

	public Crane(float cranCapacity, String craneName, String craneType, float weight) {
		super();
		this.cranCapacity = cranCapacity;
		this.craneName = craneName;
		this.craneType = craneType;
		this.weight = weight;
	}

	public float getCranCapacity() {
		return cranCapacity;
	}

	public void setCranCapacity(float cranCapacity) {
		this.cranCapacity = cranCapacity;
	}

	public String getCraneName() {
		return craneName;
	}

	public void setCraneName(String craneName) {
		this.craneName = craneName;
	}

	public String getCraneType() {
		return craneType;
	}

	public void setCraneType(String craneType) {
		this.craneType = craneType;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	}


