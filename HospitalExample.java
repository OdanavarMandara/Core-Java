class HospitalExample
{
	public static void main(String[] args)
	{
	String name="ManipalHospital";
	String location="Bangalore";
	String owner="DrRanjanPai";
	int noOfBeds=10;
	
	Hospital hospital=new Hospital(name,location,owner,noOfBeds);
	System.out.println(hospital.name);
	System.out.println(hospital.location);
	System.out.println(hospital.owner);
	System.out.println(hospital.noOfBeds);
	}
}
	
	