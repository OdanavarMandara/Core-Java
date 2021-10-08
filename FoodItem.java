class FoodItem
{
	String name;
	float price;
	String hotelName;
	int quantity;
	Foodtype type;
	int rating;
	OrderType ordertype;
	
	static float totalFoodItemPrice;
	
	FoodItem(String name, float price,String hotelName,int quantity,Foodtype type,int rating,OrderType ordertype)
	{
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
        this.quantity=quantity;
        this.type=type;
        this.rating=rating;
        this.ordertype=ordertype;
	}
	
	FoodItem(String name, float price,String hotelName)
	{
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
	}
		
    void displayDetails()
    {
		
        System.out.println("Invoked fooddetails");
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.hotelName);
        System.out.println(this.quantity);
        System.out.println(this.type);
        System.out.println(this.rating);
        System.out.println(this.ordertype);
    }

    void printTotalPrice()
	{
		float total=this.price*this.quantity;
		System.out.println("TOTAL COST:"+total);
		totalFoodItemPrice=totalFoodItemPrice+total;
	}
	

    static void printTotalFoodItemsPrice()
	{
		System.out.println("Total Fooditems Price :"+totalFoodItemPrice);
	}
	
	void printHotelName()
	{
		String n=this.name;
		System.out.println("HOTEL NAME:"+n);
		float p=this.price;
		System.out.println("PRICE:"+p);
	}
}


