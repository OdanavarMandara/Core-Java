class DeveloperRunner
{
	public static void main(String[] args)
	{
		Developer01 developer=new Developer01();
		String name=developer.getName();
		System.out.println(name);
		
		String type=developer.getType();
		System.out.println(type);
		
		int salary=developer.getSalary();
		System.out.println(salary);
		
		int experiance=developer.getExperiance();
		System.out.println(experiance);
		
		developer.setName("abc");
		String name1=developer.getName();
		System.out.println(name1);
		
		developer.setType("xyz");
		String type1=developer.getType();
		System.out.println(type1);
		
		developer.setSalary(20000);
		int salary1=developer.getSalary();
		System.out.println(salary1);
		
		developer.setExperiance(4);
		int experiance1=developer.getExperiance();
		System.out.println(experiance1);
	}
}
		
		