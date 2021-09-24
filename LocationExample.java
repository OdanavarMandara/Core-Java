class LocationExample
{
	public static void main(String[] args)
	{
	String name="amritsar";
	String state="punjab";
	String famousFor="the land of five rivers";
	String bestTimeToVisit="10am";
	
	Location location=new Location(name,state,famousFor,bestTimeToVisit);
	System.out.println(location.name);
	System.out.println(location.state);
	System.out.println(location.famousFor);
	System.out.println(location.bestTimeToVisit);
	}
}
	
	