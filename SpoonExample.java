class SpoonExample
{
	public static void main(String[] args)
	{
		Spoon spoon=new Spoon();
		String type=spoon.type;
		int price=spoon.price;
		System.out.println(type);
		System.out.println(price);
		
		spoon.type="soup spoon";
		type=spoon.type;
		System.out.println(type);
		spoon.price=200;
		System.out.println(spoon.price);
		
		Spoon spoon1=new Spoon();
		System.out.println(spoon1.type);
		System.out.println(spoon1.price);
		System.out.println(spoon1.price==spoon1.price);
		
		int spoonprice=100;
		spoon1.price=spoonprice;
		System.out.println(spoon1.price==spoon1.price);
	}
}
		
		
		
		