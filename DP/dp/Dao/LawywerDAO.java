package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.IplDTO;
import com.xworkz.dp.Dto.LawyerDTO;

public class LawywerDAO {
	
	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
	private static int counter = 0;
	
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
	
	public void save(LawyerDTO dto, int index) {
		if(index>=0 && index<lawyerDTOs.length && dto!=null) 
		{
			this.lawyerDTOs[index]=dto;
			System.out.println("lawyerDTO at index:" .concat(String.valueOf(index)));
		}
		else {
			System.err.println("inavalid index");
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
	
	public boolean searchByName(String name) {
		System.out.println("invoked searchIplByName");
		System.out.println("name passed".concat(name));
		for (int index = 0; index  < this.lawyerDTOs.length; index ++) {
			LawyerDTO ref = this.lawyerDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(name)));
				String name1 = ref.getName();
				System.out.println("matching".concat(name));
				if (name1.equals(name)) {
					System.out.println("name found");
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public boolean searchByCasesWon(int caseWon) {
		for (int i = 0; i < this.lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				int tempCaseWon=ref.getCasesWon();
				System.out.println("caseWon:" .concat(String.valueOf(tempCaseWon )));
				if(tempCaseWon==caseWon) {
				System.out.println("caseWon found");	
					return true;
				}
			}
			
		}
		return false;
		
	}
	
	public String getQualificationByName(String name) {
		for (int i = 0; i < this.lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				String name1=ref.getName();
				if(name1.equals(name)) {
					System.out.println("name found");
					return name;
				}

			}
		}
		return name;
	}
	
	public String getExpByName(String name) {
		for (int i = 0; i < this.lawyerDTOs.length; i++) {
			LawyerDTO ref=this.lawyerDTOs[i];
			if(ref!=null) {
				String name1=ref.getName();
				if(name1.equals(name)) {
					System.out.println("experience:");
					System.out.println("name found");
					return name;
				}

			}
		}
		return null;
	}
	
	public void display() {
		for (int i = 0; i < this.lawyerDTOs.length; i++) {
			LawyerDTO ref=lawyerDTOs[i];
			if(ref!=null) {
				System.out.println(i);
				System.out.println(ref.getAge());
				System.out.println(ref.getCasesWon());
				
				System.out.println(ref.getExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getName());
			}
			
		}
	}

	
}
	





