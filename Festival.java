class Festival
{
	String festreligon;
	String festname;
    String day;
	String month;
	
	Festival()
	{
		System.out.println("invoking default const");
	}
		
	
	Festival(String festreligon,String festname,String day,String month)
	{
		System.out.println("invoking parameterized const");
	this.festreligon=festreligon;
    this.festname=festname;
	this.day=day;
	this.month=month;
	}
	
	Festival(String festreligon,String festname)
	{
	this.festreligon=festreligon;
	this.festname=festname;
	}
	
	Festival(String day)
	{
	this.day=day;
	}
}
	
	
	
