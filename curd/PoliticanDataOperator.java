class PoliticanDataOperator
{
	static int position=0;
	static String[] politicanNames={null,null,null,null,null,null};
	
	static void save(String name)
	{
		System.out.println("**********************************************");
		System.out.println("Enterd Save");
		politicanNames[position]=name;
		
		System.out.println("Politican name is"+politicanNames[position]+"at the position"+position);
		position++;
		System.out.println("Exited Save");
		System.out.println("**********************************************");
	}
	static void   displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<politicanNames.length;index++)
		{
			System.out.println("Politican name is : "+politicanNames[index]);
		}
	}
}