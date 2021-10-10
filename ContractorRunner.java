class ContractorRunner
{
	public static void main(String[] args)
	{
		Contractor con=new Contractor();
		String name=con.getName();
		System.out.println(name);
		
		String experiance=con.getExperiance();
		System.out.println(experiance);
		
		int age=con.getAge();
		System.out.println(age);
		
		String location=con.getLocation();
		System.out.println(location);
		
		String qualification=con.getQualification();
		System.out.println(qualification);
		
		con.setName("sania");
		String name1=con.getName();
		System.out.println(name1);
		
		con.setExperiance("5yrs");
		String experiance1=con.getExperiance();
		System.out.println(experiance1);
		
		con.setAge(40);
		int age1=con.getAge();
		System.out.println(age1);
		
		con.setLocation("Pune");
		String location1=con.getLocation();
		System.out.println(location1);
		
		con.setQualification("BE");
		String qualification1=con.getQualification();
		System.out.println(qualification1);
	}
}
		
		
		
		
		