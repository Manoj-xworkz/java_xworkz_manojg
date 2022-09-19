class Vehicle{

static double transport(String source, String destination)
{
	if(source=="banglore" && destination=="shimoga")
	{
		System.out.println("Source:"+source+"destination:"+destination);
		return 291;
	}
	if(source=="banglore" && destination=="davangere")
	{
		System.out.println("Source:"+source+"destination:"+destination);
		return 262;
	}
	return 0;
}

static double transport(String source, String destination, boolean ontime)
{
	if(source=="banglore" && destination=="hubli")
	{
		System.out.println("Source:"+source+"destination:"+destination);
		if(ontime==true)
		{
			System.out.println("Ontime");
		}
		else
		{
			System.out.println("Not ontime");
		}
		return 500;
	}
	if(source=="banglore" && destination=="tumkur")
	{
		if(ontime==true)
		{
			System.out.println("Ontime");
		}
		else
		{
			System.out.println("Not ontime");
		}
		return 75;
	}
	return 0;
}
static double transport(String destination)
{
	if(destination=="dharwad")
	{
		System.out.println("destination:"+destination);
		return 400;
	}
	if(destination=="gokarna")
	{
		System.out.println("destination:"+destination);
		return 375;
	}
	return 0;
}

static double transport(String destination, boolean ontime)
{
	if(destination=="tirpur")
	{
	System.out.println("destination:"+destination);
		if(ontime==true)
		{
			System.out.println("Ontime");
		}
		else
		{
			System.out.println("Not ontime");
		}
		return 340;
	}
	if(destination=="mumbai")
	{
		if(ontime==true)
		{
			System.out.println("Ontime");
		}
		else
		{
			System.out.println("Not ontime");
		}
		return 1800;
	}
	return 0;
}

static double transport(boolean ontime)
{
	if(ontime==true)
		{
			System.out.println("Ontime");
			return 0;
		}
		else
		{
			System.out.println("Not ontime");
			return 7;
			
		}
		
		
}



}