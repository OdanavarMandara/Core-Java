class CricketTeamExample
{
	public static void main(String[] args)
	{
		CricketTeam ct=new CricketTeam();
		System.out.println(ct.name);
	System.out.println(ct.noofmembers);
	System.out.println(ct.score);
	System.out.println(ct.wicket);
	System.out.println(ct.coacher);
	
	String name="indian team";
    int noofmembers=11;
	int score=250;
	int wicket=6;
	String coacher="ganguli";
	
	CricketTeam ct1=new CricketTeam(name,noofmembers,score,wicket,coacher);
	System.out.println(ct1.name);
	System.out.println(ct1.noofmembers);
	System.out.println(ct1.score);
	System.out.println(ct1.wicket);
	System.out.println(ct1.coacher);
	
	CricketTeam ct2=new CricketTeam(4,11);
	System.out.println(ct2.score);
	System.out.println(ct2.wicket);
	
	CricketTeam ct3=new CricketTeam("xyz",11);
	System.out.println(ct3.name);
	System.out.println(ct3.noofmembers);
	
	CricketTeam ct4=new CricketTeam(9,"sonal");
	System.out.println(ct4.wicket);
	System.out.println(ct4.coacher);
	
	CricketTeam ct5=new CricketTeam("qpr",11,250);
	System.out.println(ct5.name);
	System.out.println(ct5.noofmembers);
	System.out.println(ct5.score);
}
}
	
	