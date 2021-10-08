class MiPhone
{
	String brand;
	int price;
	String color;
	int imei;
	PhonePay phonepay;
	
	MiPhone()
	{
	}
	MiPhone(String brand,int price,String color,int imei,PhonePay phonepay)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.imei=imei;
		this.phonepay=phonepay;
	}
	
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	void setPrice(int price)
	{
		this.color=color;
	}
	void setColor(String color)
	{
		this.color=color;
	}
	void setImei(int imei)
	{
		this.imei=imei;
	}
	void setPhonePay(PhonePay phonepay)
	{
		this.phonepay=phonepay;
	}
}