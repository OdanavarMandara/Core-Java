package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.*;

public class IplDAO {

	private IplDTO[] iplDTOs = new IplDTO[10];
	private int octopus = 0;

	public IplDTO[] getIplDTOs() {
		return iplDTOs;
	}

	public void create(IplDTO dto) {
		if (dto != null && this.octopus < this.iplDTOs.length) {
			this.iplDTOs[octopus++] = dto;
			System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getTeamName())));
		} else {
			System.out.println("invoked create");

		}
	}

	public void create(IplDTO dto, int indexvalue) {
		System.out.println("invoked overloaded const");
		if (dto != null && indexvalue < this.iplDTOs.length && indexvalue > 0) {
			this.iplDTOs[indexvalue] = dto;
		}
		System.out.println("Either the array is full or potinting to null");
	}

	public void delete(int index) {
		if (index >= 0 && index < iplDTOs.length) {
			this.iplDTOs[index] = null;
			System.out.println("delete index is".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(IplDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < iplDTOs.length) {
				this.iplDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < iplDTOs.length; i++) {
			IplDTO reference = iplDTOs[i];
			if (reference != null) {
				System.out.println("index is".concat(String.valueOf(i)));
				System.out.println(reference);
				System.out.println(reference.getTeamName());
				System.out.println(reference.getNoOfTeam());
				System.out.println(reference.getTeamSize());
				System.out.println(reference.getOwner());
				System.out.println(reference.getSponser());
			} else {
				System.err.println("it is pointing to null");
			}
		}
	}
	
	public void fetch(int index)
	{
		if(index>=0 && index<iplDTOs.length && this.iplDTOs[index]!=null)
		{
			System.out.println("--------");
			System.out.print(this.iplDTOs[index].getTeamName());
		}
		else {
			System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
		}
	}
	
	public boolean matchIplByName(String teamName) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed".concat(teamName));
		for (int index = 0; index  < this.iplDTOs.length; index ++) {
			IplDTO ref = this.iplDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String tempName = ref.getTeamName();
				System.out.println("matching".concat(tempName));
				if (teamName.equals(tempName)) {
					System.out.println("team name found");
					return true;
				}
			}
		}
		return false;
	}
	
}
