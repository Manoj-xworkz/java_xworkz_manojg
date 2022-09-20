class card{
	
	static String type;
	static int height;
	static int width;
	static double price;
	static String[] colors;
	
	
	static void displayDetails()
	{
		System.out.println("Type: "+type);
		System.out.println("height: "+height);
		System.out.println("width: "+width);
		System.out.println("price: "+price);
		if(colors!=null)
		{
			for(int index=0;index<colors.length;index++)
			{
				System.out.println("color "+index+":" +colors[index]);
			}
		}
		else
		{
			System.out.println("colors pointing to null");
		}
	}
}