package com.xworkz.dp.Dto;

public class MovieDTO {
	
	private String name;
	private String director;
	private String actor;
	private float ratings;
	private String producer;
	
	public MovieDTO()
	{
		
	}

	public MovieDTO(String name, String director, String actor, float ratings, String producer) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.ratings = ratings;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	

}
