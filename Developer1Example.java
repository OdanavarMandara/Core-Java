class Developer1Example
{
	public static void main(String[] args)
	{
		String name="alia";
		String designation="developer";
		int salary=30000;
	    int totalExp=10;
		
		Developer1 ref=new Developer1(name,designation,salary,totalExp);
		System.out.println(ref.name);
		System.out.println(ref.designation);
		System.out.println(ref.salary);
		System.out.println(ref.totalExp);
	}
}