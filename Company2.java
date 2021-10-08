class Company2
{
	String name;
	String founder;
	int est;
	int noOfEmployees;
	String headQuarter;
	float revenue;
	int noOfBranches;
	
	Company2()
	{
	}
	
	Company2(String name,String founder,int est,int noOfEmployees,String headQuarter,float revenue,int noOfBranches)
	{
		this.name=name;
		this.founder=founder;
		this.est=est;
		this.noOfEmployees=noOfEmployees;
		this.headQuarter=headQuarter;
		this.revenue=revenue;
		this.noOfBranches=noOfBranches;
	}
		void setName(String name)
		{
			this.name=name;
		}
		
		void setFounder(String founder)
		{
			this.founder=founder;
		}
		void setEst(int est)
		{
			this.est=est;
		}
		void setNoOfEmployees(int noOfEmployees)
		{
			this.noOfEmployees=noOfEmployees;
		}
		void setHeadQuarter(String headQuarter)
		{
			this.headQuarter=headQuarter;
		}
		void setRevenue(float revenue)
		{
			this.revenue=revenue;
		}
		void setNoOfBranches(int noOfBranches)
		{
			this.noOfBranches=noOfBranches;
		}
	}
