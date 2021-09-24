class DeveloperExample
{
	public static void main(String[] args)
	{
		Developer developer=new Developer();
		String name=developer.name;
		int age=developer.age;
		int id=developer.id;
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		
		developer.name="sonal";
		name=developer.name;
		System.out.println(name);
		developer.age=30;
		System.out.println(developer.age);
		developer.id=34;
		System.out.println(developer.id);
		
		Developer developer1=new Developer();
		System.out.println(developer1.name);
		System.out.println(developer1.age);
		System.out.println(developer1.id);
		System.out.println(developer1.id==developer1.id);
		
		int personid=34;
		developer1.id=personid;
		System.out.println(developer1.id==developer1.id);
	}
}
		
		
		
		