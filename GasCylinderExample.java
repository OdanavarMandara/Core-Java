class GasCylinderExample
{
	public static void main(String[] args)
	{
	Company company=Company.BHARATPETROLEUM;
	float price=600.0f;
	float weight=12.4f;
	int cylinderno=8;
	CSize size=CSize.BIG;
	
	GasCylinder cc=new GasCylinder(company,price,weight,cylinderno,size);
	System.out.println(cc.company);
	System.out.println(cc.price);
	System.out.println(cc.weight);
	System.out.println(cc.cylinderno);
	System.out.println(cc.size);
	}
}	
