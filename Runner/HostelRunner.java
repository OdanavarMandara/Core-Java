package com.xworkz.bridge.Runner;

import com.xworkz.bridge.Hostel.HostelRule;
import com.xworkz.bridge.Hostel.SharavatiHostelRules;
import com.xworkz.bridge.Hostel.VisitingDay;

public class HostelRunner {

	public static void main(String[] args) {
		
		HostelRule hostelrule=new SharavatiHostelRules();
		hostelrule.inTime();
		
		SharavatiHostelRules hostelrule2=new SharavatiHostelRules();
		hostelrule2.BreakfastTime();
		
		VisitingDay rule=new SharavatiHostelRules();
		rule.VisitingDay();
		
	}

}
