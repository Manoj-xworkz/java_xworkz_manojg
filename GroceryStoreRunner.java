class GroceryStoreRunner{
	
	public static void main(String[] tooth)
	{
		GroceryStore.setName("More");
		GroceryStore.setType("Hyper Market");
		GroceryStore.setLocation("Banglore");
		GroceryStore.setSize("Large");
		GroceryStore.setNoofBranches(4);
		GroceryStore.setColor("yellow");
		GroceryStore.setNoofFloors(2);
		GroceryStore.setNoofStaff(15);
		GroceryStore.setProfitMargin(20);
		GroceryStore.setSelfService(true);
		GroceryStore.setRefrigeratorAvailable(true);
		GroceryStore.setNoofBillingCounters(6);
		GroceryStore.setHomeDelivery(true);
		GroceryStore.setRent(20000D);
		
		
		
		
		String ref1=GroceryStore.getName();
		System.out.println("Store Name: "+ref1);
		
		String ref2=GroceryStore.getType();
		System.out.println("Store Type: "+ref2);
		
		String ref3=GroceryStore.getLocation();
		System.out.println("Store location: "+ref3);
		
		String ref4=GroceryStore.getSize();
		System.out.println("Store Size: "+ref4);
		
		int ref5=GroceryStore.getNoofBranches();
		System.out.println("No of Branches: "+ref5);
		
		String ref6=GroceryStore.getColor();
		System.out.println("Store Color: "+ref6);
		
		int ref7=GroceryStore.getNoofFloors();
		System.out.println("No of Floors: "+ref7);
		
		double ref8=GroceryStore.getNoofStaff();
		System.out.println("No of Staff: "+ref8);
		
		int ref9=GroceryStore.getProfitMargin();
		System.out.println("Profit Margin: "+ref9);
		
		boolean ref10=GroceryStore.isRefrigeratorAvailable();
		System.out.println("Refrigerator Available: "+ref10);
		
		int ref11=GroceryStore.getNoofBillingCounters();
		System.out.println("No of Billing Counters: "+ref11);
		
		boolean ref12=GroceryStore.isHomeDelivery();
		System.out.println("Home Delivery Available: "+ref12);
		
		double ref13=GroceryStore.getRent();
		System.out.println("Rent: "+ref13);
		
		boolean ref14=GroceryStore.isSelfService();
		System.out.println("Self Service "+ref14);
		
		
	}
}