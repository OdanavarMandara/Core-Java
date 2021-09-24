class LaboratoryExample
{
	public static void main(String[] args)
	{
		String name="mmmm";
		String location="2nd floor";
		int noofrooms=4;
		String[] operatorNames={"mandara",name};
		
		Laboratory lab=new Laboratory(name,location,noofrooms,operatorNames);
		System.out.println(lab.name);
		System.out.println(lab.location);
		System.out.println(lab.noofrooms);
		System.out.println(lab.operatorNames);
		
		lab.noofrooms=5;
		System.out.println(lab.noofrooms);
		lab.location="3rd floor";
		System.out.println(lab.location);
		System.out.println(location==lab.location);
	}
}
		