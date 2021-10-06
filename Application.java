class Application
{
	String name;
	int version;
	CompanyDetails company;
	
	Application(String name,int version)
	{
		this.name=name;
		this.version=version;
	}
	
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.company);
	}
}
		