package com.xworkz.dp;

import com.xworkz.dp.Dao.DoctorDAO;
import com.xworkz.dp.Dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {
		
		DoctorDTO doctorDTOs=new DoctorDTO("zamadar","Skin specialist","aaa","male",20000,50);
		DoctorDTO doctorDTOs1=new DoctorDTO("kavya","Gynocologist","bbb","female",30000,40);
		DoctorDTO doctorDTOs2=new DoctorDTO("raghavendra","Skin specialist","abc","male",50000,65);
		
		DoctorDAO ipl=new DoctorDAO();
		ipl.create(doctorDTOs);
		ipl.create(doctorDTOs2);
		ipl.display();
		
		ipl.delete(1);
		ipl.display();
		
		ipl.update(doctorDTOs2, 7);
		ipl.display();
		
		ipl.fetch(1);
		ipl.display();
		
		
		ipl.matchIplByName("zamadar");
		ipl.display();

		

	}

}
