class MarketStarter
{
	public static void main(String[] args)
	{
		Market market=new Market();
		market.noOfShops=10;
		market.name="KR MARKET";
		market.city="BLR";
		market.displayDetails();
		
		Market market1=new Market();
		market1.noOfShops=20;
		market1.name="Russal Market";
		market1.displayDetails();
	}
}