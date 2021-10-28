package com.xworkz.dp;
import com.xworkz.dp.Constants.*;
import com.xworkz.dp.Dao.MilkcanDAO;
import com.xworkz.dp.Dto.MilkcanDTO;

public class MilkcanStarter {

	public static void main(String[] args) {
		
		MilkcanDTO milkcanDTOs=new MilkcanDTO("2ltr","round",Quality.GOOD,"silver",200);
		MilkcanDTO milkcanDTOs1=new MilkcanDTO("3ltr","round",Quality.GOOD,"silver",300);
		MilkcanDTO milkcanDTOs2=new MilkcanDTO("1ltr","round",Quality.GOOD,"silver",400);
		
		MilkcanDAO ipl=new MilkcanDAO();
		ipl.create(milkcanDTOs);
		ipl.create(milkcanDTOs2);
		ipl.display();
		
		ipl.delete(1);
		ipl.display();
		
		ipl.update(milkcanDTOs2, 7);
		ipl.display();
		
		ipl.fetch(1);
		ipl.display();
		
		
		ipl.matchIplByName("2ltr");
		ipl.display();

	}

}
