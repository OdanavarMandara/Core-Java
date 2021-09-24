class CricketTeam
{
	String name;
    int noofmembers;
	int score;
	int wicket;
	String coacher;
	
	CricketTeam()
	{
		System.out.println("invoking default const");
	}
		
	
	CricketTeam(String name, int noofmembers,int score,int wicket,String coacher)
	{
		System.out.println("invoking parameterized const");
	this.name=name;
    this.noofmembers=noofmembers;
	this.score=score;
	this.wicket=wicket;
	this.coacher=coacher;
	}
	
	CricketTeam(int score,int wicket)
	{
	this.score=score;
	this.wicket=wicket;
	}
	
	CricketTeam(String name, int noofmembers)
	{
	this.name=name;
	this.noofmembers=noofmembers;
	}
	
	CricketTeam(int wicket,String coacher)
	{
	this.wicket=wicket;
	this.coacher=coacher;
	}
	
	CricketTeam(String name, int noofmembers,int score)
	{
	this.name=name;
	this.noofmembers=noofmembers;
	this.score=score;
	}
}
	
	
	
