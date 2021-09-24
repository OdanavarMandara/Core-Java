class GasCylinder
{
	Company company;
	float price;
	float weight;
	int cylinderno;
	CSize size;
	
	GasCylinder(Company company,float price,float weight,int cylinderno,CSize size)
	{
		System.out.println("invoking parameterized const");
	this.company=company;
	this.price=price;
	this.weight=weight;
	this.cylinderno=cylinderno;
	this.size=size;
	}
	GasCylinder()
	{
		System.out.println("invoking default const");
	}
}
	