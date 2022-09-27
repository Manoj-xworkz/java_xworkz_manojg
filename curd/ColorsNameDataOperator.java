class ColorsNameDataOperator
{
	static int position=0;
	static String[] colorsNames={null,null,null,null,null,null,null};
	
	static void save(String name)
	{
		
		
		
		if(name!=null && name.length()>3)
		{
			if(position>=7)
			{
				System.err.println("Colors name exceed");
				System.out.println("**********************************************");
				return;

			}
		
			System.out.println("**********************************************");
			System.out.println("Enterd Save");
			colorsNames[position]=name;
			
			System.out.println("Colors Names is"+colorsNames[position]+"at the position: "+position);
			position++;
			System.out.println("Exited Save");
			System.out.println("**********************************************");
		}
		else
		{
			System.out.println("**********************************************");
			System.err.println("Data not valid "+name);
			System.out.println("**********************************************");
		}
	}
	static void   displayDetails()
	{
		System.out.println("Displaying details");
		for(int index=0;index<colorsNames.length;index++)
		{
			System.out.println("Colors Names name is : "+colorsNames[index]);
		}
	}
	
	static boolean findColor(String color)
	{
		
		for(int index=0;index<colorsNames.length;index++)
		{
			if(colorsNames[index]==color)
			return true;
		}
		return false;
	}
}