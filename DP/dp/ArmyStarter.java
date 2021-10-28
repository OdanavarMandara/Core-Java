package com.xworkz.dp;

import com.xworkz.dp.dto.ArmyDTO;

public class ArmyStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArmyDTO army=new ArmyDTO();
		army.setCountry("India");
		army.setNoOfSoldiers(1000);
		army.setNoOfWorkers(500);
		army.setTypesOfWeapon("aaa");
		army.setNoOfCarrier(400);
		
		ArmyDTO army2 = new ArmyDTO("srilanka",2000,3000,"bbb",4000);
		ArmyDTO army3 = new ArmyDTO("india",2000,3000,"bbb",4000);
		ArmyDTO army4 = new ArmyDTO("nepal",2000,3000,"bbb",4000);
		ArmyDTO army5 = new ArmyDTO("japan",2000,3000,"bbb",4000);
		
		ArmyDTO[] a=new ArmyDTO[5];
		a[0]=army;
		a[1]=army2;
		a[2]=army3;
		a[3]=army4;
		a[4]=army5;
		for(int i=0;i<a.length;i++)
		{
			ArmyDTO ref=a[i];
			if(ref!=null)
			{
				System.out.println(ref.getCountry());
				System.out.println(ref.getNoOfSoldiers());
				System.out.println(ref.getNoOfWorkers());
				System.out.println(ref.getTypesOfWeapon());
				System.out.println(ref.getNoOfCarrier());
			}
			else
			{
				System.out.println("index is pointing to null".concat(String.valueOf(i)));
				
			}
		}
		

	}

}
