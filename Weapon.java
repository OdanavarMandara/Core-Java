class Weapon
{
	String name;
	String brand;
    String mode;
	int price;
	
	Weapon()
	{
		System.out.println("invoking default const");
	}
		
	
	Weapon(String name,String brand,String mode,int price)
	{
		System.out.println("invoking parameterized const");
	this.name=name;
    this.brand=brand;
	this.mode=mode;
	this.price=price;
	}
	
	Weapon(String name,String brand)
	{
	this.name=name;
	this.mode=mode;
	}
}
	
	
	
