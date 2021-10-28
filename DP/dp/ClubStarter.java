package com.xworkz.dp;

import com.xworkz.dp.Dao.ClubDAO;
import com.xworkz.dp.Dto.ClubDTO;

public class ClubStarter {

	public static void main(String[] args) {
		
		ClubDTO clubDTO=new  ClubDTO(50,1000,4.5f,1000,10);
		ClubDTO clubDTO1=new  ClubDTO(60,2000,5.5f,1200,20);
		ClubDTO clubDTO2=new ClubDTO(70,2500,6.5f,1100,15);
		
		
		ClubDAO ref=new ClubDAO();
		ref.save(clubDTO);
		ref.save(clubDTO2);
		
		
		ref.display();
		
		ref.delete(-1);
		ref.delete(0);
		
		ref.display();
		
		
		ref.update(clubDTO2,6);
		
		ref.display();

	}

}
