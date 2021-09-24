class Jail
{
	String location;
	String name;
	int noofcells;
	float areainacres;
	int persons;
	int yearofconstruction;
	boolean strict;
	int noofcriminals;
	
	Jail(String location,String name,int noofcells,float areainacres,int persons,int yearofconstruction,boolean strict,int noofcriminals)
	{
		this.location=location;
		this.name=name;
		this.noofcells=43;
		this.areainacres=30;
		this.persons=50;
		this.yearofconstruction=yearofconstruction;
		this.noofcriminals=50;
		this.strict=strict;
		System.out.println("created with string,string,float,int");
		System.out.println(this.noofcells=this.persons);
	}
	
	Jail()
	{
	}
}
		
		
		
	
	