class BillionariesNameDataOperator
{
	static int position=0;
	static String[] billionariesName={null,null,null,null,null,null,null,null,null,null};
	
	static void save(String name)
	{
		
		
		
		if(name!=null && name.length()>3)
		{
			if(position>=10)
			{
				System.err.println("Billionaries Nameexceed");
				System.out.println("**********************************************");
				return;

			}
		
			System.out.println("**********************************************");
			System.out.println("Enterd Save");
			billionariesName[position]=name;
			
			System.out.println("Billionaries Name is"+billionariesName[position]+"at the position: "+position);
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
		System.out.println("**********************************************");
		System.out.println("Displaying details");
		for(int index=0;index<billionariesName.length;index++)
		{
			System.out.println("Billionaries Name is : ["+index+"] "+billionariesName[index]);
		}
		System.out.println("**********************************************");
	}
	
	static boolean findBillionaries(String billionaries)
	{
		
		for(int index=0;index<billionariesName.length;index++)
		{
			if(billionariesName[index]==billionaries)
			return true;
		}
		return false;
	}
	
	static String update(String oldName, String newName)
	{
		if(oldName!=null && newName!=null)
		{
			System.out.println("Entered update using old name");
			for(int index=0;index<billionariesName.length;index++)
			{
				if(oldName==billionariesName[index])
				{
					String ref=billionariesName[index];
					System.out.println("Billionarie Found: "+ref+" at index: "+index+" updated: "+newName);
					billionariesName[index]=newName;
				}
				
			}
		}
		else{
			System.out.println("Data invalid");
			
			
		}
		return null;
	}
	
	
	static String update(int index, String newName)
	{
		if(newName!=null)
		{
			System.out.println("Entered update using index");
			String ref=billionariesName[index];
			System.out.println("Billionarie Found: "+ref+" updated: "+newName+" at index: "+index);
			billionariesName[index]=newName;
			return newName;
		}
		
		else
		{
			System.out.println("Data invalid");
			
			
		}
		return null;
	}
	
	static boolean delete(String name)
	{
		if(name!=null)
		{
			System.out.println("Entered delete using name");
			for(int index=0;index<billionariesName.length;index++)
			{
				if(name==billionariesName[index])
				{
					String ref=billionariesName[index];
					System.out.println("Billionarie Found: "+ref+" Deleting into null at index: "+index);
					billionariesName[index]=null;
					return true;
				}
			
			}
		}
		else{
			System.out.println("Data invalid");
			
			
		}
		return false;
	}
	static boolean delete(int index)
	{
		if(billionariesName[index]!=null)
		{
			System.out.println("Entered delete using index");
			billionariesName[index]=null;
			System.out.println("Deleting into null at index: "+index);
			return true;
		}
		
		else
		{
			System.out.println("Cannot Delete null");
			
			
		}
		return false;
	}
	
	
	
}