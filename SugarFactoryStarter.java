class SugarFactoryStarter
{
	public static void main(String[] args)
	{
		SugarFactory ref=new SugarFactory(90);
		System.out.println(ref.capacity);
		
		//ref=new SugarFactory();
		
		
		Machine machine=new Machine();
		System.out.println(ref.machine.working);
		
		
		ref.machine=machine;
		ref.machine=null;
		
	}
}