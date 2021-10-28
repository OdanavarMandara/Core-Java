package com.xworkz.dp.Dao;
import com.xworkz.dp.Dto.*;

public class BucketDAO {
	
	private BucketDTO[] bucketDTOs = new BucketDTO[10];
	private int count = 0;

	public void save(BucketDTO ref) {

		if (this.count < bucketDTOs.length && ref != null) {
			this.bucketDTOs[count++] = ref;
		} else {
			System.err.println("Either container is full or passed reference is null");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < bucketDTOs.length) {
			bucketDTOs[index] = null;
		} else {
			System.err.println("index is invalid");
		}
	}

	public void update(BucketDTO updateRef, int index) {
		if (updateRef != null) {
			if (index >= 0 && index < bucketDTOs.length) {
				this.bucketDTOs[index] = updateRef;
			} else {
				System.out.println("passed reference is not valid");
			}
		} else {
			System.out.println("reference You are passing is null");
		}
	}

	public void display() {
		for (int i = 0; i < bucketDTOs.length; i++) {
			BucketDTO reference = bucketDTOs[i];
			if (reference != null) {
				System.out.println(reference);
				System.out.println(reference.getColor());
				System.out.println(reference.getSize());
				System.out.println(reference.getPrice());
				System.out.println(reference.getQuantity());
				System.out.println(reference.getWeight());
				System.out.println(reference.getCompany());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(i)));
			}
		}
	}
}
	
	
	


