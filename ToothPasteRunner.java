class ToothPasteRunner{
	
	public static void main(String[] tooth)
	{
		ToothPaste.setBrandName("Colgate");
		ToothPaste.setMolecularFormula("C12H7Cl3FNaO2");
		ToothPaste.setPrice(250D);
		ToothPaste.setExpiryDate("02-AUG-2022");
		ToothPaste.setBatchNo("B52");
		ToothPaste.setColor("White");
		ToothPaste.setFlavor("Salt");
		ToothPaste.setWeight(150D);
		ToothPaste.setSize("Medium");
		ToothPaste.setFlourideIncluded(true);
		ToothPaste.setMinAge(5);
		ToothPaste.setBaseIngredients("Abrasives");
		ToothPaste.setSelfLifePeriod("2 years");
		ToothPaste.setMfdDate("02-JUN-2020");
		ToothPaste.setPerpose("Oral Hygine");
		
		
		
		String ref1=ToothPaste.getBrandName();
		System.out.println("Brand Name: "+ref1);
		
		String ref2=ToothPaste.getMolecularFormula();
		System.out.println("Molecular Formula: "+ref2);
		
		double ref3=ToothPaste.getPrice();
		System.out.println("Price: "+ref3);
		
		String ref4=ToothPaste.getExpiryDate();
		System.out.println("Expiry Date: "+ref4);
		
		String ref5=ToothPaste.getBatchNo();
		System.out.println("BatchNo: "+ref5);
		
		String ref6=ToothPaste.getColor();
		System.out.println("Color: "+ref6);
		
		String ref7=ToothPaste.getFlavor();
		System.out.println("Flavor: "+ref7);
		
		double ref8=ToothPaste.getWeight();
		System.out.println("Weight: "+ref8);
		
		String ref9=ToothPaste.getSize();
		System.out.println("Size: "+ref9);
		
		boolean ref10=ToothPaste.isFlourideIncluded();
		System.out.println("Flouride Included: "+ref10);
		
		int ref11=ToothPaste.getMinAge();
		System.out.println("Min Age: "+ref11);
		
		String ref12=ToothPaste.getBaseIngredients();
		System.out.println("Base Ingredients: "+ref12);
		
		String ref13=ToothPaste.getSelfLifePeriod();
		System.out.println("Self Life Period: "+ref13);
		
		String ref14=ToothPaste.getMfdDate();
		System.out.println("Mfd Date: "+ref14);
		
		String ref15=ToothPaste.getPerpose();
		System.out.println("Perpose: "+ref15);
	}
}