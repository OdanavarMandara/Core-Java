class CompanyDetails
{
	String name;
	String ceo;
	String cfo;
	CountryDetails country;
	
	CompanyDetails(String name,String ceo,String cfo)
	{
		this.name=name;
		this.ceo=ceo;
		this.cfo=cfo;
	}
	
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.ceo);
		System.out.println(this.cfo);
	}
}	