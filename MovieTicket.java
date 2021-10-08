class MovieTicket
{
	String movieName;
	String theater;
	float price;
	int noOfSeats;
	MovieType type;
	
	static float totalPrice;
	
	MovieTicket(String movieName,String theater,float price, int noOfSeats,MovieType type)
	{
		this.movieName=movieName;
		this.theater=theater;
		this.price=price;
		this.noOfSeats=noOfSeats;
		this.type=type;
		System.out.println("Invoked 5 parameters const");
	}
	
	MovieTicket(String movieName,String theater,float price)
	{
		this.movieName=movieName;
		this.theater=theater;
		this.price=price;
		System.out.println("Invoked 3 parameters const");
	}
	
	void displayDetails()
	{
		
		System.out.println(this.movieName);
		System.out.println(this.theater);
		System.out.println(this.price);
		System.out.println(this.noOfSeats);
		System.out.println(this.type);
	}
	
	void printTotalPrice()
	{
		float total=this.price*this.noOfSeats;
		System.out.println("TOTAL PRICE :"+total);
		totalPrice=totalPrice+total;
		System.out.println("Total Price :"+totalPrice);
	}
	
	static void printTotalMovieTicketPrice()
	{
		System.out.println("Total Price :"+totalPrice);
	}
}
		