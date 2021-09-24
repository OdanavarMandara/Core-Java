class MatchBoxExample
{
	public static void main(String[] args)
	{
		String brand="xyz";
		int noofsticks=10;
		boolean empty=true;
		Size size=Size.MEDIUM;
		
		
		
		MatchBox mb=new MatchBox(brand,noofsticks,empty,size);
		System.out.println(mb.brand);
		System.out.println(mb.noofsticks);
		System.out.println(mb.size);
				System.out.println(mb.empty);

		
		mb.brand="abc";
		System.out.println(mb.brand);
		mb.size=size.SMALL;
		System.out.println(mb.size);
		mb.empty=false;
				System.out.println(empty=mb.empty);


	}
}
		