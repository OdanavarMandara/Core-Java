class ForestRunner
{
	public static void main(String[] args)
	{
		boolean reserved=true;
		Forest forest=new Forest("Jim Corbett National Park","Uttarakhand",reserved);
		System.out.println(forest.name);
		System.out.println(forest.location);
		System.out.println(forest.reserved);
		System.out.println(forest.state);
		
		forest.state=new State("Kanha National Park","MP",9);
		System.out.println(forest.state);
		System.out.println(forest);
		System.out.println(forest.state.name);
		System.out.println(forest.state.CMname);
		System.out.println(forest.state.noOfDistricts);

forest.state.capitalcity=new CapitalCity(100);
System.out.println(forest.state.capitalcity);
System.out.println(forest);
forest.state.capitalcity.name="Bangalore";
forest.state.capitalcity.famousFor="IT";
System.out.println(forest.state.capitalcity.name);
System.out.println(forest.state.capitalcity.population);
System.out.println(forest.state.capitalcity.famousFor);
	}
}
		