package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.IplDTO;
import com.xworkz.dp.Dto.LawyerDTO;

public class LawywerDAO {
	
	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
	private int counter = 0;
	
	public LawyerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}
	
	public void save(LawyerDTO dto) 
	{
		if (dto != null && this.counter < this.lawyerDTOs.length) 
		{
			this.lawyerDTOs[counter++] = dto;
			System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getName())));
		} 
		else 
		{
			System.out.println("invoked create");

		}
	}
	
	public void delete(int index) 
	{
		if (index >= 0 && index < lawyerDTOs.length) 
		{
			this.lawyerDTOs[index] = null;
			System.out.println("delete index is".concat(String.valueOf(index)));
		} 
		
		else 
		{
			System.err.println("index is invalid");
		}
	}
	
	public boolean searchIplByName(String name) {
		System.out.println("invoked searchIplByName");
		System.out.println("name passed".concat(name));
		for (int index = 0; index  < this.lawyerDTOs.length; index ++) {
			LawyerDTO ref = this.lawyerDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String name1 = ref.getName();
				System.out.println("matching".concat(name));
				if (name.equals(name)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public boolean searchIplByCasesWon(int casesWon) {
		System.out.println("invoked searchIplByCasesWon");
		System.out.println("name passed".concat(casesWon));
		for (int index = 0; index  < this.lawyerDTOs.length; index ++) {
			LawyerDTO ref = this.lawyerDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String name1 = ref.getName();
				System.out.println("matching".concat(name));
				if (name.equals(name)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		return false;
	}

}
