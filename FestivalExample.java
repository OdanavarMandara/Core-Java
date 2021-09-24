class FestivalExample
{
	public static void main(String[] args)
	{
	Festival fest=new Festival();
	System.out.println(fest.festreligon);
	System.out.println(fest.festname);
	System.out.println(fest.day);
	System.out.println(fest.month);
	
	String festreligon="Hindu";
	String festname="diwali";
    String day="monday";
	String month="nov";
	
	Festival fest2=new Festival(festreligon,festname,day,month);
	System.out.println(fest2.festreligon);
	System.out.println(fest2.festname);
	System.out.println(fest2.day);
	System.out.println(fest2.month);
	
	Festival fest3=new Festival("Hindu","dasshera");
	System.out.println(fest3.festreligon);
	System.out.println(fest3.festname);
	
	Festival fest4=new Festival("tue");
	System.out.println(fest4.day);
	
	Festival fest5=new Festival("jan");
	System.out.println(fest5.month);
	
	}
}
	
	