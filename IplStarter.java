package com.xworkz.dp;
import com.xworkz.dp.Dto.*;
import com.xworkz.dp.Dao.*;
public class IplStarter {

	public static void main(String[] args) {
		
		IplDTO iplDTOs=new IplDTO("RCB",5,12,"united spirts","puma");
		IplDTO iplDTOs1=new IplDTO("KKR",3,12,"sharuk khan","MPL");
		IplDTO iplDTOs2=new IplDTO("MI",5,12,"mukesh ambani","DHL exress");
		
		IplDAO ipl=new IplDAO();
		ipl.create(iplDTOs);
		ipl.create(iplDTOs2);
		ipl.display();
		
		ipl.delete(1);
		ipl.display();
		
		ipl.update(iplDTOs2, 7);
		ipl.display();
		
		ipl.fetch(1);
		ipl.display();
		
		
		ipl.matchIplByName("MI");
		ipl.display();
	}
		
		
		
	}
	
			