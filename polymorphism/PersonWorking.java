class PersonWorking{

static String work(String Company, double Salary)
{
	if(Company=="TCS")
	{
		System.out.println("company: TCS");
		System.out.println("Salary:"+Salary);
		return "Tata Consultancy Services";
	
	}
	if(Company=="IBM")
	{
		System.out.println("company: IBM");
		System.out.println("Salary:"+Salary);
		return "International Business Machines";
	
	}
	
	return null;
}

static String work(String Company, double Salary, String Designation)
{
	if(Company=="FIS")
	{
		System.out.println("company: TCS");
		System.out.println("Salary:"+Salary);
		System.out.println("Designation:"+Designation);
		return "Fidelity National Information Services";
	
	}
	if(Company=="WIPRO")
	{
		System.out.println("company: Wipro");
		System.out.println("Salary:"+Salary);
		return "Western India Palm Refined Oils Limited";
	
	}
	
	return null;
}


}