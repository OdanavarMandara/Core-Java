class Forest
{
	String name;
	String location;
	boolean reserved;
	State state;
	
	Forest(String name)
	{
		this.name=name;
	}
	
	Forest(String name,String location,boolean reserved)
	{
		this(name);
		this.location=location;
		this.reserved=reserved;
	}
}