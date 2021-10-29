package com.xworkz.dp.Dto;

public class LawyerDTO {
	
	private String name;
	private String qualification;
	private int experience;
	private String gender;
	private int age;
	private String countryType;
	private int casesWon;
	private int casesLost;
	
	public LawyerDTO()
	{
	}

	public LawyerDTO(String name, String qualification, int experience,String gender, int age, String courtType,
			int casesWon, int casesLost) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.countryType = countryType;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
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

	public String getCountryType() {
		return countryType;
	}

	public void setCourtType(String courtType) {
		this.countryType = courtType;
	}

	public int getCasesWon() {
		return casesWon;
	}

	public void setCasesWon(int casesWon) {
		this.casesWon = casesWon;
	}

	public int getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(int casesLost) {
		this.casesLost = casesLost;
	}
	
	
	}




