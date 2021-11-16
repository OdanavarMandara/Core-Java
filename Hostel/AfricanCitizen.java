package com.xworkz.bridge.Hostel;

import com.xworkz.bridge.Hostel.VotingRule.*;
import com.xworkz.bridge.Hostel.TrafficRule.*;
import com.xworkz.bridge.Hostel.MarriageRule.*;

public class AfricanCitizen implements VotingRule, TrafficRule, MarriageRule {
	
	private String name;
	private String stateName;
	public void displayDetails(String name,String stateName)
	{
		System.out.println(this.name);
		System.out.println(this.stateName);
		
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getStateName() {
		return stateName;
	}



	public void setStateName(String stateName) {
		this.stateName = stateName;
	}



	public int validAge() {
		System.out.println("invoking valid age");
		return 30;
	}

	public String validId() {
		System.out.println("invoking valid id");
		return "KA018";
	}

	public boolean validLicence() {
		System.out.println("invoking valid Licence");
		return false;
	}

	public String licenseNo() {
		System.out.println("invoking Licence no");
		return "D87650986";
	}

	public boolean validInsurance() {
		System.out.println("invoking validInsurance");
		return false;
	}

	public int validAge1() {
		
		return 50;
	
	

}
}
