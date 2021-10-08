class FoodItemStarter
{
	public static void main(String[] args)
	{
		FoodItem fooditem1=new FoodItem("gobi",100.0f,"aa",10,Foodtype.GOOD,4,OrderType.ONLINE);
		fooditem1.displayDetails();
		fooditem1.printTotalPrice();
		
		FoodItem fooditem2=new FoodItem("kachori",200.0f,"bb",20,Foodtype.GOOD,4,OrderType.OFFLINE);
		fooditem2.printTotalPrice();
		
		FoodItem.printTotalFoodItemsPrice();
	}
}