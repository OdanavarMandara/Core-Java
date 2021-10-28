package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.*;
import com.xworkz.dp.Dto.WalletDTO;

public class WalletDAO {
	
	private WalletDTO[] walletDTOs = new WalletDTO[10];
	private int octopus = 0;

	public WalletDTO[] getWalletDTOs() {
		return walletDTOs;
	}

	public void create(WalletDTO dto) {
		if (dto != null && this.octopus < this.walletDTOs.length) {
			this.walletDTOs[octopus++] = dto;
			System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getCompanyName())));
		} else {
			System.out.println("invoked create");

		}
	}

	public void create(WalletDTO dto, int indexvalue) {
		System.out.println("invoked overloaded const");
		if (dto != null && indexvalue < this.walletDTOs.length && indexvalue > 0) {
			this.walletDTOs[indexvalue] = dto;
		}
		System.out.println("Either the array is full or potinting to null");
	}

	public void delete(int index) {
		if (index >= 0 && index < walletDTOs.length) {
			this.walletDTOs[index] = null;
			System.out.println("delete index is".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(WalletDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < walletDTOs.length) {
				this.walletDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < walletDTOs.length; i++) {
			WalletDTO reference = walletDTOs[i];
			if (reference != null) {
				System.out.println("index is".concat(String.valueOf(i)));
				System.out.println(reference);
				System.out.println(reference.getCompanyName());
				System.out.println(reference.getMaterial());
				System.out.println(reference.getTotalCompartments());
				System.out.println(reference.getPrice());
				System.out.println(reference.getCoinCompartment());
			} else {
				System.err.println("it is pointing to null");
			}
		}
	}
	
	public void fetch(int index)
	{
		if(index>=0 && index<walletDTOs.length && this.walletDTOs[index]!=null)
		{
			System.out.println("--------");
			System.out.print(this.walletDTOs[index].getCompanyName());
		}
		else {
			System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
		}
	}
	
	public boolean matchIplByName(String companyName) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed".concat(companyName));
		for (int index = 0; index  < this.walletDTOs.length; index ++) {
			WalletDTO ref = this.walletDTOs[index ];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(index)));
				String companyName1 = ref.getCompanyName();
				System.out.println("matching".concat(companyName1));
				if (companyName1.equals(companyName1)) {
					System.out.println("company name found");
					return true;
				}
			}
		}
		return false;
	}
}
	
