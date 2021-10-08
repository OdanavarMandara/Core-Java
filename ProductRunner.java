class ProductRunner
{
	public static void main(String[] args)
	{
		Product product1=new Product("Hair Dryer","EC",1500,2,"Philips");
		product1.productDetails();
		product1.printTotalCost();
		
		Product product2=new Product("Trimmer","EC",200,4,"Nova");
		product2.printTotalCost();
		
		Product.printTotalProductsPrice();
	}
}