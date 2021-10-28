package com.xworkz.dp.Dto;

public class IplDTO {
	
	private String teamName;
	private Integer noOfTeam;
	private Integer teamSize;
	private String owner;
	private String sponser;
	
	public IplDTO()
	{
		
	}
	
	

	public IplDTO(String teamName, Integer noOfTeam, Integer teamSize, String owner, String sponser) {
		super();
		this.teamName = teamName;
		this.noOfTeam = noOfTeam;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponser = sponser;
	}



	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getNoOfTeam() {
		return noOfTeam;
	}

	public void setNoOfTeams(Integer noOfTeam) {
		this.noOfTeam = noOfTeam;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponser() {
		return sponser;
	}

	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	
	

}
