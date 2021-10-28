package com.xworkz.dp;

import com.xworkz.dp.Dao.WalletDAO;
import com.xworkz.dp.Dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
		
		
		WalletDTO walletDTOs=new WalletDTO("woodland","leather",3,2000,1);
		WalletDTO walletDTOs1=new WalletDTO("levis","leather",3,2000,2);
		WalletDTO walletDTOs2=new WalletDTO("peterengland","leather",3,2000,3);
		
		WalletDAO ipl=new WalletDAO();
		ipl.create(walletDTOs);
		ipl.create(walletDTOs2);
		ipl.display();
		
		ipl.delete(1);
		ipl.display();
		
		ipl.update(walletDTOs2, 7);
		ipl.display();
		
		ipl.fetch(1);
		ipl.display();
		
		
		ipl.matchIplByName("woodland");
		ipl.display();
	}
		
		
		
	}


