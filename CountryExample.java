class CountryExample
{
	public static void main(String[] args)
	{
		String name="India";
		int noOfStates=29;
		String primeMinisterName="Narendra Modi";
	    String presidentName="Ram Nath Kovind";
		
		Country ref=new Country(name,noOfStates,primeMinisterName,presidentName);
		System.out.println(ref.name);
		System.out.println(ref.noOfStates);
		System.out.println(ref.primeMinisterName);
		System.out.println(ref.presidentName);
	}
}