class WeaponExample
{
	public static void main(String[] args)
	{
	Weapon weapon=new Weapon();
	System.out.println(weapon.name);
	System.out.println(weapon.brand);
	System.out.println(weapon.mode);
	System.out.println(weapon.price);
	
	String name="XM8";
	String brand="xyz";
    String mode="fire";
	int price=10000;
	
	Weapon weapon1=new Weapon(name,brand,mode,price);
	System.out.println(weapon1.name);
	System.out.println(weapon1.brand);
	System.out.println(weapon1.mode);
	System.out.println(weapon1.price);
	
	Weapon weapon2=new Weapon("XM8","xyz");
	System.out.println(weapon2.name);
	System.out.println(weapon2.brand);
	}
}
	
	