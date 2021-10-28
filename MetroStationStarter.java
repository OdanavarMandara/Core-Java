package com.xworkz.dp;
import com.xworkz.dp.Dto.MetroStationDTO;
import com.xworkz.dp.Dao.MetroStationDAO;


public class MetroStationStarter {

	public static void main(String[] args) {
		
		MetroStationDTO metroDTO=new  MetroStationDTO("aaa","jayanagar",10,12);
		MetroStationDTO metroDTO1=new  MetroStationDTO("bbb","malleshwaram",10,12);
		MetroStationDTO metroDTO2=new MetroStationDTO("ccc","jpnagar",11,1);
		
		
		MetroStationDAO ref=new MetroStationDAO();
		ref.save(metroDTO);
		ref.save(metroDTO2);
		
		
		ref.display();
		
		ref.delete(-1);
		ref.delete(0);
		
		ref.display();
		
		
		ref.update(metroDTO2,6);
		
		ref.display();

	}

}
