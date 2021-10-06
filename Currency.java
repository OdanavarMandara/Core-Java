class Currency
{
	String name;
	CountryDetails country;
	int value;
	
	Currency(String name)
	{
		this.name=name;
		this.value=value;
	}
	
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.value);
	}
}
	