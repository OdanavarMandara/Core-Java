class State
{
	String name;
	int noOfDistricts;
	String CMname;
	CapitalCity capacity;
	
	State(String CMname)
	{
		this.CMname=CMname;
	}
	
	State(String name,String CMname,int noOfDistricts)
	{
		this(CMname);
		this.name=name;
		this.noOfDistricts=noOfDistricts;
	}
}