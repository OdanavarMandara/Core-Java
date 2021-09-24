class Laboratory
{
	String name;
	String location;
	int noofrooms;
	String[] operatorNames;
	LabType type;
	
	Laboratory(String name, String location,int noofrooms,String[] operatorNames)
	{
		this.name=name;
		this.location=location;
		this.noofrooms=noofrooms;
		this.operatorNames=operatorNames;
	}
	Laboratory()
	{
	}
}