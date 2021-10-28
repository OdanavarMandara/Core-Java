package com.xworkz.dp;


import com.xworkz.dp.Dao.MovieDAO;
import com.xworkz.dp.Dto.MovieDTO;

public class MovieStarter {

	public static void main(String[] args) {
		
		MovieDTO movieDTOs=new MovieDTO("taare zameen par","amir khan","amk",4.5f,"amirkhan");
		MovieDTO movieDTOs1=new MovieDTO("hello","vikram kumar","akhil akkineni",5.5f,"akk");
		MovieDTO movieDTOs2=new MovieDTO("arya2","sukumar","allu arjun",4.5f,"aditya babu");
		
		MovieDAO ipl=new MovieDAO();
		ipl.create(movieDTOs);
		ipl.create(movieDTOs2);
		ipl.display();
		
		ipl.delete(1);
		ipl.display();
		
		ipl.update(movieDTOs2, 7);
		ipl.display();
		
		ipl.fetch(1);
		ipl.display();
		
		
		ipl.matchIplByName("arya2");
		ipl.display();

	}

}
