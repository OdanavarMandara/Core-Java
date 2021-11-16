package com.xworkz.bridge.Hostel;

import com.xworkz.bridge.Enum.*;

import com.xworkz.bridge.Hostel.VotingRule.*;
import com.xworkz.bridge.Hostel.TrafficRule.*;
import com.xworkz.bridge.Hostel.MarriageRule.*;

public class IndianCitizen implements VotingRule, TrafficRule, MarriageRule {

	private String name="alia";
	private Address address;
	
	public void displayNameAndAddressDetails(String name, Address address) {
		System.out.println(this.name);
		System.out.println(this.address);
	}

	
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
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
		return null;
	}

	public boolean validInsurance() {
		System.out.println("invoking validInsurance");
		return false;
	}

	public int validAge1() {
		
		return 40;
	}



	

}
