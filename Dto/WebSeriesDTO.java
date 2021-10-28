package com.xworkz.dp.Dto;
import com.xworkz.dp.Constants.*;

public class WebSeriesDTO {

	private String name;
	private Genre genre;
	private int noOfCharacters;
	private float rating;
	private int totalSeasons;
	private int currentSeason;
	
	public WebSeriesDTO()
	{
	}
	

	public WebSeriesDTO(String name, Genre genre, int noOfCharacters, float rating, int totalSeasons,
			int currentSeason) {
		super();
		this.name = name;
		this.genre = genre;
		this.noOfCharacters = noOfCharacters;
		this.rating = rating;
		this.totalSeasons = totalSeasons;
		this.currentSeason = currentSeason;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getTotalSeasons() {
		return totalSeasons;
	}

	public void setTotalSeasons(int totalSeasons) {
		this.totalSeasons = totalSeasons;
	}

	public int getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(int currentSeason) {
		this.currentSeason = currentSeason;
	}
	
	
	}


