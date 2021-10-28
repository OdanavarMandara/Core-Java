package com.xworkz.dp.Dao;
import com.xworkz.dp.Dto.*;
public class CameraDAO {
	
	private CameraDTO[] cameraDTOs = new CameraDTO[10];
	private int count = 0;

	public void save(CameraDTO ref) {

		if (this.count < cameraDTOs.length && ref != null) {
			this.cameraDTOs[count++] = ref;
		} else {
			System.err.println("Either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < cameraDTOs.length) {
			cameraDTOs[index] = null;
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(CameraDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < cameraDTOs.length) {
				this.cameraDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < cameraDTOs.length; i++) {
			CameraDTO reference = cameraDTOs[i];
			if (reference != null) {
				System.out.println(reference);
				System.out.println(reference.getCompany());
				System.out.println(reference.getType());
				System.out.println(reference.getPixel());
				System.out.println(reference.getCost());
				System.out.println(reference.getBatteryCapacity());
				System.out.println(reference.getWeight());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));
			}
		}
	}
}
	
	
	
	


