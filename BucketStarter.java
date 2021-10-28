package com.xworkz.dp;
import com.xworkz.dp.Dao.*;
import com.xworkz.dp.Constants.*;
import com.xworkz.dp.Dto.*;

public class BucketStarter {

	public static void main(String[] args) {
		
		BucketDTO bucketDTO=new  BucketDTO("White",Size1.BIG,300.9f,111,20,"aa");
		BucketDTO bucketDTO1=new  BucketDTO("blue",Size1.MEDIUM,400.9f,112,20,"cc");
		BucketDTO bucketDTO2=new BucketDTO("black",Size1.SMALL,400.9f,112,20,"cc");
		
		
		BucketDAO ref=new BucketDAO();
		ref.save(bucketDTO);
		ref.save(bucketDTO2);
		
		
		ref.display();
		
		ref.delete(-1);
		ref.delete(0);
		
		ref.display();
		
		
		ref.update(bucketDTO2,6);
		
		ref.display();
		
		

	}

}
