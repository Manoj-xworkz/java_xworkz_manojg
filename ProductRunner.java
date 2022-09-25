class ProductRunner{

public static void main (String[] items)
{
	System.out.println("Product Information");
	System.out.println("No of products:"+items.length);
	String product=items[0]; //name
	String product1=items[1];//price
	String product2=items[2];//quantity
	String product3=items[3];//Type
	String product4=items[4];//quality
	
	System.out.println(" Product name: "+product);
	System.out.println(" Product price: "+product1);
	System.out.println(" Product quantity: "+product2);
	System.out.println(" Product type: "+product3);
	System.out.println(" Product quality: "+product4);
	
	
	int convertedPrice=Integer.parseInt(product1);
	System.out.println("converted price:"+convertedPrice);
	if(convertedPrice<=1000)
	{
		System.out.println("It is affordable ");
	}
	else
	{
		System.out.println("It is not affordable");
	}
	
	float convertedQuantity=Float.parseFloat(product2);
	System.out.println("converted quality:"+convertedQuantity);
	if(convertedQuantity>=100)
	{
		System.out.println("Quantity is sufficient");
	}
	else
	{
		System.out.println("Quantity is not sufficient");
	}
	
	
	System.out.println("Product type:"+product3);
	if(product3=="Grocery")
	{
		System.out.println("It is Essential");
	}
	else
	{
		System.out.println("Not Essential");
	}
	
	
	
	Boolean convertedQuality=Boolean.parseBoolean(product4);
	System.out.println("converted quality:"+convertedQuality);
	if(convertedQuality==true)
	{
		System.out.println("Quality is OK");
	}
	else
	{
		System.out.println("Quality is not OK");
	}
	
	double totalPrice=(convertedPrice*convertedQuantity);
	if(totalPrice>=30000)
	{
		System.out.println("Large ammount");
	}
	else
	{
		System.out.println("Ammount is OK");
	}
}


}


































































































































































