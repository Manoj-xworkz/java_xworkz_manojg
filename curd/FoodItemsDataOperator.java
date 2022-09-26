class FoodItemsDataOperator
{
	static int position=0;
	static String[] FoodNames={null,null,null,null,null,null};
	
	static void save(String name)
	{
		System.out.println("**********************************************");
		System.out.println("Enterd Save");
		FoodNames[position]=name;
		
		System.out.println("Food items name is"+FoodNames[position]+"at the position: "+position);
		position++;
		System.out.println("Exited Save");
		System.out.println("**********************************************");
	}
	static void   displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<FoodNames.length;index++)
		{
			System.out.println("Food items name is : "+FoodNames[index]);
		}
	}
}