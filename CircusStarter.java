package com.xworkz.dp;

import com.xworkz.dp.Dao.CircusDAO;
import com.xworkz.dp.Dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {
		
		CircusDTO circusDTOs=new CircusDTO("aaa",200,5,4,5);
		CircusDTO circusDTOs1=new CircusDTO("bbb",300,4,3,5);
		CircusDTO circusDTOs2=new CircusDTO("ccc",400,3,4,5);
		
		CircusDAO ipl=new CircusDAO();
		ipl.create(circusDTOs);
		ipl.create(circusDTOs2);
		ipl.display();
		
		ipl.delete(1);
		ipl.display();
		
		ipl.update(circusDTOs2, 7);
		ipl.display();
		
		ipl.fetch(1);
		ipl.display();
		
		
		ipl.matchIplByName("ccc");
		ipl.display();


	}

}
