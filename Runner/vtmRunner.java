package com.xworkz.bridge.Runner;

import com.xworkz.bridge.Enum.Address;
import com.xworkz.bridge.Hostel.AfricanCitizen;
import com.xworkz.bridge.Hostel.IndianCitizen;
import com.xworkz.bridge.Hostel.MarriageRule;
import com.xworkz.bridge.Hostel.TrafficRule;
import com.xworkz.bridge.Hostel.VotingRule;

public class vtmRunner {

	public static void main(String[] args) {
		
		VotingRule votingrule=new IndianCitizen();
		int age=votingrule.validAge();
		String validId=votingrule.validId();
		System.out.println(votingrule.validAge());
		System.out.println(votingrule.validId());
		
		
		
		
		
		VotingRule votingrule2=new AfricanCitizen();
		int age1=votingrule2.validAge();
		
		String validId1=votingrule2.validId();
		System.out.println(votingrule2.validAge());
		System.out.println(votingrule2.validId());
		
		TrafficRule trafficRule=new IndianCitizen();
		boolean vL=trafficRule.validLicence();
		String LN=trafficRule.licenseNo();
		boolean vI=trafficRule.validInsurance();
		
		System.out.println(trafficRule.validLicence());
		System.out.println(trafficRule.licenseNo());
		System.out.println(trafficRule.validInsurance());
		
		
		TrafficRule trafficRule2=new AfricanCitizen();
		boolean vL1=trafficRule2.validLicence();
		String LN1=trafficRule2.licenseNo();
		boolean vI1=trafficRule2.validInsurance();
		
		System.out.println(trafficRule2.validLicence());
		System.out.println(trafficRule2.licenseNo());
		System.out.println(trafficRule2.validInsurance());
		
		
		MarriageRule marriageRule=new IndianCitizen();
		
		int aa = marriageRule.validAge();
		
		
		MarriageRule marriageRule2=new AfricanCitizen();
		
		int bb=marriageRule.validAge();
		
		IndianCitizen ref=new IndianCitizen();
		ref.displayNameAndAddressDetails("Astha",Address.KARWAR);
		
		AfricanCitizen ref2=new AfricanCitizen();
		ref2.displayDetails("alia","karnataka");
		
		
		
		

	}

}
