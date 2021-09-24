class JailExample
{
	public static void main(String[] args)
	{
	String location=ballari;
	String name=ballari centraL;
	int noofcells=20;
	float areainacres=30;
	int persons=40;
	int yearofconstruction=1934;
	boolean strict;
	int noofcriminals=60;
	
	Jail jail=new Jail(location,name,noofcells,areainacres,persons,yearofconstruction,strict,noofcriminals);
	System.out.println(jail.location);
	System.out.println(jail.name);
	System.out.println(jail.noofcells);
	System.out.println(jail.areainacres);
	System.out.println(jail.persons);
	System.out.println(jail.yearofconstruction);
	System.out.println(jail.strict);
	System.out.println(jail.noofcriminals);
	System.out.println(jail.location=jail.location);
	System.out.println(jail.noofcells=jail.persons);
	}
}