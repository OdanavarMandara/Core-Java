class TheaterExample
{
	public static void main(String[] args)
	{
		TicketPrice tp=TicketPrice.GANDHI;
		System.out.println("Gandhi="+tp.price);
		
		TicketPrice tp1=TicketPrice.BALCONY;
		System.out.println(tp1.price);
		System.out.println(tp1.tax);
		
		System.out.println(TicketPrice.BOX.tax+TicketPrice.BOX.price);
	}
}
		