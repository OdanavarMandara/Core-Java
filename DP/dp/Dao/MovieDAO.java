package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.MovieDTO;

public class MovieDAO {
	
	private MovieDTO[] movieDTOs = new MovieDTO[10];
	private int octopus = 0;

	public MovieDTO[] getWalletDTOs() {
		return movieDTOs;
	}

	public void create(MovieDTO dto) {
		if (dto != null && this.octopus < this.movieDTOs.length) {
			this.movieDTOs[octopus++] = dto;
			System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getName())));
		} else {
			System.out.println("invoked create");

		}
	}

	public void create(MovieDTO dto, int indexvalue) {
		System.out.println("invoked overloaded const");
		if (dto != null && indexvalue < this.movieDTOs.length && indexvalue > 0) {
			this.movieDTOs[indexvalue] = dto;
		}
		System.out.println("Either the array is full or potinting to null");
	}

	public void delete(int index) {
		if (index >= 0 && index < movieDTOs.length) {
			this.movieDTOs[index] = null;
			System.out.println("delete index is".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(MovieDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < movieDTOs.length) {
				this.movieDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < movieDTOs.length; i++) {
			MovieDTO reference = movieDTOs[i];
			if (reference != null) {
				System.out.println("index is".concat(String.valueOf(i)));
				System.out.println(reference);
				System.out.println(reference.getName());
				System.out.println(reference.getDirector());
				System.out.println(reference.getActor());
				System.out.println(reference.getRatings());
				System.out.println(reference.getProducer());
			} else {
				System.err.println("it is pointing to null");
			}
		}
	}
	
	public void fetch(int index)
	{
		if(index>=0 && index<movieDTOs.length && this.movieDTOs[index]!=null)
		{
			System.out.println("--------");
			System.out.print(this.movieDTOs[index].getName());
		}
		else {
			System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
		}
	}
	
	public boolean matchIplByName(String getName) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed".concat(getName));
		for (int index = 0; index  < this.movieDTOs.length; index ++) {
			MovieDTO ref = this.movieDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String quantity1 = ref.getName();
				System.out.println("matching".concat(quantity1));
				if (quantity1.equals(quantity1)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		return false;
	}
}


