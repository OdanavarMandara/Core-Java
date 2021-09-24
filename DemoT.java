class DemoT
{
	static String god="kali";//global variable
	public static void main(String args[])
	{
		covidward("adhya",4,false);
		//localEx("demon",5,true);
	}
	static void covidward(String name,int reg_no,boolean freport)
	{
		System.out.println("name of the ghost>"+name);
		System.out.println("ghost id>"+reg_no);
		System.out.println("its ghost<*^*>"+freport);
		System.out.println("this is god>"+god);
	}
	static void localEx(String name,int reg_no,boolean freport)
	{
		System.out.println("name of the ghost>"+name);
		System.out.println("ghost id>"+reg_no);
		System.out.println("its ghost<*^*>"+freport);
		System.out.println("this is god>"+god);
	}
}
