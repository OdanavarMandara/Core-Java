class SocialMediaApp

{
	String name;
	float size;
	String lang;
	String platform;
	float version;
	String company;
	
	SocialMediaApp()
	{
	}
	
	
	SocialMediaApp(String name,float size,String lang,String platform,float version,String company)
	{
		this.name=name;
		this.size=size;
		this.lang=lang;
		this.platform=platform;
		this.version=version;
		this.company=company;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setSize(float size)
	{
		this.size=size;
	}
	
	void setLang(String lang)
	{
		this.lang=lang;
	}
	void setPlatform(String platform)
	{
		this.platform=platform;
	}
	void setVersion(float version)
	{
		this.version=version;
	}
	void setCompany(String company)
	{
		this.company=company;
	}
}
		
	