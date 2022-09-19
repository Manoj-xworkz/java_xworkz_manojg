class SpiceJet{

	static void flightNos(String[] flightNos)
	{
		System.out.println("Entered flightNos");
		System.out.println("Total flightNos"+flightNos.length);
		
		for(int index=0;index<flightNos.length;index++)
		{
			String ref=flightNos[index];
			System.out.println("flightNo"+ref);
			
		}
		
	}
}