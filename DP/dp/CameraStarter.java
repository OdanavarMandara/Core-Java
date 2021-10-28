package com.xworkz.dp;
import com.xworkz.dp.Dao.CameraDAO;
import com.xworkz.dp.Dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args) {
		
		CameraDTO cameraDTO=new  CameraDTO("canon","compact",50,20000.8f,500.5f,500);
		CameraDTO cameraDTO1=new  CameraDTO("nikon","DSLR",60,30000.8f,500.5f,600);
		CameraDTO cameraDTO2=new CameraDTO("sony","mirror",70,40000.8f,600.6f,700);
		
		
		CameraDAO ref=new CameraDAO();
		ref.save(cameraDTO);
		ref.save(cameraDTO2);
		
		
		ref.display();
		
		ref.delete(-1);
		ref.delete(0);
		
		ref.display();
		
		
		ref.update(cameraDTO2,6);
		
		ref.display();
		

	}

}
