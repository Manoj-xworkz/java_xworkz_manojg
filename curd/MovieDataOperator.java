class MovieDataOperator
{
	static int position=0;
	static String[] movieNames={null,null,null,null,null,null};
	
	static void save(String name)
	{
		System.out.println("**********************************************");
		System.out.println("Enterd Save");
		movieNames[position]=name;
		
		System.out.println("Movie name is"+movieNames[position]+"at the position"+position);
		position++;
		System.out.println("Exited Save");
		System.out.println("**********************************************");
	}
	static void   displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<movieNames.length;index++)
		{
			System.out.println("Movie name is : "+movieNames[index]);
		}
	}
}