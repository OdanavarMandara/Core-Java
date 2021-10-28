package com.xworkz.crud.operator;

public class ChocolateOperationStarter {

	private String name;
	private String[] flavours=new String[5];
	private int counter=0;
	
	public ChocolateOperationStarter()
	{
		this("dairymilkoreo");
		System.out.println("invoked ChocolateStarter no-arg const");
	}
	
	public ChocolateOperationStarter(String name)
	{
		this.name=name;
		System.out.println("invoked ChocolateStarter string const");
	}
	
	public String getName()
	{
		return this.name;
	}
	public void addFlavours(String name)
	{
		System.out.println("invoked addFlavours");
		System.out.println("Name arg:".concat(name));
		if(this.counter<5)
		{
			this.flavours[this.counter]=name;
			this.counter++;
		}
			else
			{
				System.out.println("array is full");
			}
		}
	public void displayFlavours()
	{
	System.out.println("invoked displayflavours");
	for(int i=0;i<this.flavours.length;i++)
	{
		String n=this.flavours[i];
		System.out.println(n);
	}
	}
}
