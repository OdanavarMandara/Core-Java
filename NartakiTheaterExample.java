class NartakiTheaterExample
{
	public static void main(String[] args)
	{
		Theater theater=new Theater("Nartaki",TicketPrice.BOX);
		theater.location="Majestic";
		System.out.println(theater);
		System.out.println(theater.name);
		System.out.println(theater.location);
		System.out.println(theater.capacity);
		System.out.println(theater.ticketPrice);
		System.out.println(theater.ticketPrice.price);
		System.out.println(theater.ticketPrice.tax);
	}
}	