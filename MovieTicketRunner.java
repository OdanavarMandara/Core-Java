class MovieTicketRunner
{
	public static void main(String[] args)
	{
		MovieTicket movieticket=new MovieTicket("Taare zameen par","aa",100,2,MovieType.HORROR);
		movieticket.displayDetails();
		movieticket.printTotalPrice();
		
		MovieTicket movieticket1=new MovieTicket("aaa","bb",200);
		movieticket1.printTotalPrice();
		
		MovieTicket.printTotalMovieTicketPrice();
	}
}