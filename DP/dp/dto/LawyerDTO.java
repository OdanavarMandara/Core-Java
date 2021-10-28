package com.xworkz.dp.Dto;

public class LawyerDTO {
	
	private String name;
	private String qualification;
	private String experience;
	private String gender;
	private int age;
	private String courtType;
	private int casesWon;
	private int casesLost;
	
	public LawyerDTO()
	{
	}

	public LawyerDTO(String name, String qualification, String experience, String gender, int age, String courtType,
			String casesWon, String casesLost) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.courtType = courtType;
		this.casesWon = casesWon;
		this.casesLost = casesLost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourtType() {
		return courtType;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public String getCasesWon() {
		return casesWon;
	}

	public void setCasesWon(String casesWon) {
		this.casesWon = casesWon;
	}

	public String getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(String casesLost) {
		this.casesLost = casesLost;
	}
	
	
	}


