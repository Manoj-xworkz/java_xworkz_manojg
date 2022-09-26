class TempleDataOperator
{
	static int position=0;
	static String[] templeName={null,null,null,null,null,null};
	
	static void save(String name)
	{
		System.out.println("**********************************************");
		System.out.println("Enterd Save");
		templeName[position]=name;
		
		System.out.println("Saved name is"+templeName[position]+"at the position"+position);
		position++;
		System.out.println("Exited Save");
		System.out.println("**********************************************");
	}
	static void   displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<templeName.length;index++)
		{
			System.out.println("Temple name is : "+templeName[index]);
		}
	}
}