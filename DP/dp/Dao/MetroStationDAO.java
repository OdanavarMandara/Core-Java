package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.MetroStationDTO;

public class MetroStationDAO {
	
	private MetroStationDTO[] metroDTOs = new MetroStationDTO[10];
	private int count = 0;

	public void save(MetroStationDTO ref) {

		if (this.count < metroDTOs.length && ref != null) {
			this.metroDTOs[count++] = ref;
		} else {
			System.err.println("Either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < metroDTOs.length) {
			metroDTOs[index] = null;
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(MetroStationDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < metroDTOs.length) {
				this.metroDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < metroDTOs.length; i++) {
			MetroStationDTO reference = metroDTOs[i];
			if (reference != null) {
				System.out.println(reference);
				System.out.println(reference.getName());
				System.out.println(reference.getRoute());
				System.out.println(reference.getOpenTime());
				System.out.println(reference.getCloseTime());
				
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));
			}
		}
	}
}

	
	