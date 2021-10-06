class CurrencyRunner
{
	public static void main(String[] args)
	{
		Currency currency=new Currency("Rupees");
		currency.displayDetails();
		currency=new Currency("dollor");
		currency.value=10;
		System.out.println(currency);
		currency.displayDetails();
		
		currency.country=new CountryDetails("India",100);
		System.out.println(currency.country);
		CountryDetails country=currency.country;
		country.displayDetails();
		
		Application application=new Application("Java",10);
		application.displayDetails();
		
		application.company=new CompanyDetails("aaa","xyz","abc");
		CompanyDetails company=application.company;
		company.displayDetails();
		
		company.country=new CountryDetails();
		CountryDetails country=company.country;
		country.displayDetails();
		
	}
}