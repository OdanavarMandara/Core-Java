package com.xworkz.dp;
import com.xworkz.dp.Dao.*;
import com.xworkz.dp.Constants.*;
import com.xworkz.dp.Dto.*;


import com.xworkz.dp.Dao.WebSeriesDAO;
import com.xworkz.dp.Dto.WebSeriesDTO;
import com.xworkz.dp.Dao.*;
import com.xworkz.dp.Dto.*;
public class DressCodeStarter {

	public static void main(String[] args) {
		
		
		DressCodeDTO dresscodeDTO=new  DressCodeDTO(Size.S,"cotton","Black",2000.2f,"female");
		DressCodeDTO dresscodeDTO1=new DressCodeDTO(Size.M,"cotton","yellow",2000.2f,"female");
		DressCodeDTO dresscodeDTO2=new DressCodeDTO(Size.L,"cotton","navy blue",2000.2f,"female");
		
		
		DressCodeDAO ref=new DressCodeDAO();
		ref.save(dresscodeDTO);
		ref.save(dresscodeDTO2);
		
		
		ref.display();
		
		ref.delete(-1);
		ref.delete(0);
		
		ref.display();
		
		
		ref.update(dresscodeDTO2,6);
		
		ref.display();
		

	}

}
