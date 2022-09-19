class Person{
	
	public static void main(String[] work)
	{
		System.out.println("Enterd main");
		
		
		String ref1=PersonWorking.work("TCS",360000);
		System.out.println("Company full form"+ref1);
		
		String ref2=PersonWorking.work("IBM",500000);
		System.out.println("Company full form"+ref2);
		
		String ref3=PersonWorking.work("FIS",600000,"Developer");
		System.out.println("Company full form"+ref3);
		
		String ref4=PersonWorking.work("WIPRO",350000,"Developer");
		System.out.println("Company full form"+ref4);
	}
}
