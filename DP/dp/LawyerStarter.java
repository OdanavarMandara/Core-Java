package com.xworkz.dp;
import  com.xworkz.dp.Dto.LawyerDTO;
import com.xworkz.dp.Dao.LawywerDAO;

public class LawyerStarter {

	public static void main(String[] args) {
		LawyerDTO lawyer=new LawyerDTO("saniya","BALLB", 6, "female",35,"India",5,7);
		LawyerDTO lawyer1=new LawyerDTO("ahana","MALLB",10,"female",40,"USA",9,1);
		LawyerDTO lawyer2=new LawyerDTO("shlok","LLB", 2, "male", 28, "india", 3, 3);
        
		LawywerDAO law=new LawywerDAO();
		law.save(lawyer1);
		law.save(lawyer);
		law.save(lawyer2);
		boolean ref = law.searchByName("saniya");
		System.out.println(ref);
		boolean ref1 = law.searchByCasesWon(9);
		System.out.println(ref1);
		law.save(lawyer, 3);
		String name=law.getExpByName("ahana");
		System.out.println(name);
		String name1 = law.getQualificationByName("shlok");
		System.out.println(name1);
		
		law.display();
		
		
		
	    law.delete(1);

	}

}


	
