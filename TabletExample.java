class TabletExample
{
	public static void main(String[] args)
	{
		Tablet tablet=new Tablet();
		String name=tablet.name;
		int price=tablet.price;
		int expiredate=tablet.expiredate;
		System.out.println(name);
		System.out.println(price);
		System.out.println(expiredate);
		
		tablet.name="glotret";
		name=tablet.name;
		System.out.println(name);
		tablet.price=100;
		System.out.println(tablet.price);
		tablet.expiredate=2022;
		System.out.println(tablet.expiredate);
		
		Tablet tablet1=new Tablet();
		System.out.println(tablet1.name);
		System.out.println(tablet1.price);
		System.out.println(tablet1.expiredate);
		System.out.println(tablet1.expiredate==tablet1.expiredate);
		
		int expiredate1=2023;
		tablet1.expiredate=expiredate1;
		System.out.println(tablet1.expiredate==tablet1.expiredate);
	}
}
		
		
		
		