class CurtainStarter
{
	public static void main(String[] args)
	{
		Curtain curtain=new Curtain();
		String type=curtain.getType();
		System.out.println("Type:"+type);
		
		String brand=curtain.getBrand();
		System.out.println("Brand :"+brand);
		
		String material=curtain.getMaterial();
		System.out.println("Material :"+material);
		
		int price=curtain.getPrice();
		System.out.println("Price :"+price);
		
		String color=curtain.getColor();
		System.out.println("Color :"+color);
		
		curtain.setType("doorCurtain");
		String type1=curtain.getType();
		System.out.println(type1);
		
		curtain.setBrand("bb");
		String brand1=curtain.getBrand();
		System.out.println(brand1);
		
		curtain.setMaterial("cc");
		String material1=curtain.getMaterial();
		System.out.println(material1);
		
		curtain.setPrice(200);
		int price1=curtain.getPrice();
		System.out.println(price1);
		
		curtain.setColor("white");
		String color1=curtain.getColor();
		System.out.println(color1);
	}
}
		
		