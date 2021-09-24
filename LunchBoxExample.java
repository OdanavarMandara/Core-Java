class LunchBoxExample
{
	public static void main(String[] args)
	{
	String name="hotbox";
	String material="fibre";
	int price=2000;
	
	LunchBox lb=new LunchBox(name,material,price);
	System.out.println(lb.name);
	System.out.println(lb.material);
	System.out.println(lb.price);
	}
}
	