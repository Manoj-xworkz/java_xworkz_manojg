class GraduateDataOperator
{
	static int position=0;
	static String[] GraduateNames={null,null,null,null,null,null};
	
	static void save(String name)
	{
		System.out.println("**********************************************");
		System.out.println("Enterd Save");
		GraduateNames[position]=name;
		
		System.out.println("Graduate Name is"+GraduateNames[position]+"at the position: "+position);
		position++;
		System.out.println("Exited Save");
		System.out.println("**********************************************");
	}
	static void  displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<GraduateNames.length;index++)
		{
			System.out.println("Graduate Name is : "+GraduateNames[index]);
		}
	}
}