class LaboratoryExample
{
	public static void main(String[] args)
	{
		String name="mmmm";
		String location="2nd floor";
		int noofrooms=4;
		
		Laboratory lab=new Laboratory(name,location,noofrooms);
		System.out.println(lab.name);
		System.out.println(lab.location);
		System.out.println(lab.noofrooms);
	}
}
		