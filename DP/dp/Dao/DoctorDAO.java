package com.xworkz.dp.Dao;

import com.xworkz.dp.Dto.DoctorDTO;

public class DoctorDAO {
	
	 
		
		private DoctorDTO[] doctorDTOs = new DoctorDTO[10];
		private int counter = 0;

		public DoctorDTO[] getWalletDTOs() {
			return doctorDTOs;
		}

		public void create(DoctorDTO dto) {
			if (dto != null && this.counter < this.doctorDTOs.length) {
				this.doctorDTOs[counter++] = dto;
				System.out.println("Invoked create dto method : ".concat(String.valueOf(dto.getName())));
			} else {
				System.out.println("invoked create");

			}
		}

		public void create(DoctorDTO dto, int indexvalue) {
			System.out.println("invoked overloaded const");
			if (dto != null && indexvalue < this.doctorDTOs.length && indexvalue > 0) {
				this.doctorDTOs[indexvalue] = dto;
			}
			System.out.println("Either the array is full or potinting to null");
		}

		public void delete(int index) {
			if (index >= 0 && index < doctorDTOs.length) {
				this.doctorDTOs[index] = null;
				System.out.println("delete index is".concat(String.valueOf(index)));
			} else {
				System.err.println("index is invalid");
			}
		}

		public void update(DoctorDTO updateRef, int index) {
			if (updateRef != null) {
				if (index >= 0 && index < doctorDTOs.length) {
					this.doctorDTOs[index] = updateRef;
				} else {
					System.out.println("passed reference is not valid");
				}
			} else {
				System.out.println("reference You are passing is null");
			}
		}

		public void display() {
			for (int i = 0; i < doctorDTOs.length; i++) {
				DoctorDTO reference = doctorDTOs[i];
				if (reference != null) {
					System.out.println("index is".concat(String.valueOf(i)));
					System.out.println(reference);
					System.out.println(reference.getName());
					System.out.println(reference.getSpecilization());
					System.out.println(reference.getHospitalName());
					System.out.println(reference.getGender());
					System.out.println(reference.getSalary());
					System.out.println(reference.getAge());
				} else {
					System.err.println("it is pointing to null");
				}
			}
		}
		
		public void fetch(int index)
		{
			if(index>=0 && index<doctorDTOs.length && this.doctorDTOs[index]!=null)
			{
				System.out.println("--------");
				System.out.print(this.doctorDTOs[index].getName());
			}
			else {
				System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
			}
		}
		
		public boolean matchIplByName(String name) {
			System.out.println("invoked matchIplByName");
			System.out.println("name passed".concat(name));
			for (int index = 0; index  < this.doctorDTOs.length; index ++) {
				DoctorDTO ref = this.doctorDTOs[index ];
				if (ref != null) {
					System.out.println("ref in index is not null".concat(String.valueOf(index)));
					String name1 = ref.getName();
					System.out.println("matching".concat(name1));
					if (name1.equals(name1)) {
						System.out.println(" name found");
						return true;
					}
				}
			}
			return false;
		}

}
