class PhonePay
{
	String company;
	float version;
	String architect;
	boolean working;
	
	PhonePay()
	{
	}
	
	PhonePay(String company,float version,String architect,boolean working)
	{
		this.company=company;
		this.version=version;
		this.architect=architect;
		this.working=working;
	}
	
	void setCompany(String company)
	{
		this.company=company;
	}
	void setVersion(float version)
	{
		this.version=version;
	}
	void setArchitect(String architect)
	{
		this.architect=architect;
	}
	void setWorking(boolean working)
	{
		this.working=working;
	}
}