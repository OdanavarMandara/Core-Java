package com.xworkz.bridge.Hostel;

import com.xworkz.bridge.Hostel.HostelRule;

public class SharavatiHostelRules implements HostelRule,VisitingDay{

	
	public int inTime() {
		System.out.println("invoking intime");
		return 9;
	}
	
	public int BreakfastTime()
	{
	System.out.println("invoking breakfasttime");
	return 7;
	}
	
	public String VisitingDay()
	{
		System.out.println("invoking visitingday");
		return "SUNDAY";
	}

}
