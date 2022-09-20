class hospital{

	static String name;
	static String type;
	static String size;
	static int noOfStaff;
	static int noOfRooms;
	static int noOfOT;
	static int noOfPaitentCapacity;
	static int noOfdoctors;
	static int noOfNurses;
	static double netWorth;
	static boolean working;
	static boolean profitable;
	static int noOfAmbulance;
	static int noOfICU;
	static int noOfMedicals;
	static boolean labIncluded;
	static char rating;
	
	static String[] typesofDoctor;
	static String[] colorofBeds;
	static String[] hospitalBranches;
	static String[] hospitalFunctions;
	static String[] insuranceAcceptedCompanies;
	static String[] departmentList;
	static String[] paymentAccepted;
	static String[] typeofWards;
	static String[] listofEquipments;
	static String[] typesofOT;
	static long[] phoneNos;
	static String[] listofPost;
	
	
	
	static void displayDetails()
	{
		System.out.println("Type: "+name);
		System.out.println("Type: "+type);
		System.out.println("height: "+size);
		System.out.println("width: "+noOfStaff);
		System.out.println("No Of Rooms: "+noOfRooms);
		System.out.println("No Of OT: "+noOfOT);
		System.out.println("No Of PaitentCapacity: "+noOfPaitentCapacity);
		System.out.println("No Of doctors: "+noOfdoctors);
		System.out.println("No Of Nurses: "+noOfNurses);
		System.out.println("Net Worth: "+netWorth);
		System.out.println("Working: "+working);
		System.out.println("Profitable: "+profitable);
		System.out.println("No Of Ambulance: "+noOfAmbulance);
		System.out.println("No Of ICU: "+noOfICU);
		System.out.println("No Of Medicals: "+noOfMedicals);
		System.out.println("Lab Included: "+labIncluded);
		System.out.println("Rating: "+rating);
		
		
		if(typesofDoctor!=null)
		{
			
			for(int index=0;index<typesofDoctor.length;index++)
			{
				System.out.println("Type of Doctors "+index+":" +typesofDoctor[index]);
			}
		}
		else
		{
			System.out.println("typesofDoctor pointing to null");
		}
		
		
		if(colorofBeds!=null)
		{
			for(int index=0;index<colorofBeds.length;index++)
			{
				System.out.println("Color of Beds "+index+":" +colorofBeds[index]);
			}
		}
		else
		{
			System.out.println("colorofBeds pointing to null");
		}
		
		
		if(hospitalBranches!=null)
		{
			for(int index=0;index<hospitalBranches.length;index++)
			{
				System.out.println("Hospital Branches "+index+":" +hospitalBranches[index]);
			}
		}
		else
		{
			System.out.println("hospitalBranches pointing to null");
		}
		
		
		
		if(hospitalFunctions!=null)
		{
			for(int index=0;index<hospitalFunctions.length;index++)
			{
				System.out.println("Hospital Functions "+index+":" +hospitalFunctions[index]);
			}
		}
		else
		{
			System.out.println("hospitalFunctions pointing to null");
		}
		
		
		
		if(insuranceAcceptedCompanies!=null)
		{
			for(int index=0;index<insuranceAcceptedCompanies.length;index++)
			{
				System.out.println("Insurance Accepted Companies "+index+":" +insuranceAcceptedCompanies[index]);
			}
		}
		else
		{
			System.out.println("insuranceAcceptedCompanies pointing to null");
		}
		
		
		
		if(departmentList!=null)
		{
			for(int index=0;index<departmentList.length;index++)
			{
				System.out.println("Department List "+index+":" +departmentList[index]);
			}
		}
		else
		{
			System.out.println("departmentList pointing to null");
		}
		
		
		if(paymentAccepted!=null)
		{
			for(int index=0;index<paymentAccepted.length;index++)
			{
				System.out.println("Payment Accepted "+index+":" +paymentAccepted[index]);
			}
		}
		else
		{
			System.out.println("paymentAccepted pointing to null");
		}
		
		
		if(typeofWards!=null)
		{
			for(int index=0;index<typeofWards.length;index++)
			{
				System.out.println("Type of Wards "+index+":" +typeofWards[index]);
			}
		}
		else
		{
			System.out.println("typeofWards pointing to null");
		}
		
		
		if(typesofDoctor!=null)
		{
			for(int index=0;index<listofEquipments.length;index++)
			{
				System.out.println("List of Equipments "+index+":" +listofEquipments[index]);
			}
		}
		else
		{
			System.out.println("listofEquipmentsr pointing to null");
		}
		
		
		
		if(typesofOT!=null)
		{
			for(int index=0;index<typesofOT.length;index++)
			{
				System.out.println("Types of OT "+index+":" +typesofOT[index]);
			}
		}
		else
		{
			System.out.println("typesofOT pointing to null");
		}
		
		
		
		if(phoneNos!=null)
		{
			for(int index=0;index<phoneNos.length;index++)
			{
				System.out.println("Phone Nos "+index+":" +phoneNos[index]);
			}
		}
		else
		{
			System.out.println("phoneNos pointing to null");
		}
		
		
		
		if(listofPost!=null)
		{
			for(int index=0;index<listofPost.length;index++)
			{
				System.out.println("List of Post "+index+":" +listofPost[index]);
			}
		}
		else
		{
			System.out.println("listofPost pointing to null");
		}
		

	}
}

