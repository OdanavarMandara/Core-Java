package com.xworkz.dp;
import com.xworkz.dp.Dao.TempleDAO;
import com.xworkz.dp.Dto.TempleDTO;

public class TempleStarter {

	public static void main(String[] args) {
		
		TempleDTO templeDTO=new  TempleDTO("ISCKON","Bangalore","aa",true,2);
		TempleDTO templeDTO1=new  TempleDTO("tirupati","AP","bb",false,2);
		TempleDTO templeDTO2=new TempleDTO("ISCKON","Bangalore","cc",false,2);
		
		
		TempleDAO web=new TempleDAO();
		web.save(templeDTO);
		web.save(templeDTO2);
		
		
		web.display();
		
		web.delete(-1);
		web.delete(0);
		
		web.display();
		
		
		web.update(templeDTO2,6);
		
		web.display();
	}

}
