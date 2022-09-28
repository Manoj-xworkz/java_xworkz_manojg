class BillionariesNameDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	BillionariesNameDataOperator.save("Elon Musk");
	BillionariesNameDataOperator.save("Bernard Arnault");
	BillionariesNameDataOperator.save("Gautam Adani");
	BillionariesNameDataOperator.save("Jeff Bezos");
	BillionariesNameDataOperator.save("Bill Gates");
	BillionariesNameDataOperator.save("Warren Buffett");
	BillionariesNameDataOperator.save("Larry Ellison");
	BillionariesNameDataOperator.save("Larry Page"); 
	BillionariesNameDataOperator.save("Mukesh Ambani");
	BillionariesNameDataOperator.save("Sergey Brin");	
	BillionariesNameDataOperator.displayDetails();
	boolean ref=BillionariesNameDataOperator.findBillionaries("Mukesh Ambani");
	System.out.println("Billionarie found: "+ref);
	
	BillionariesNameDataOperator.update("Sergey Brin","Steve Ballmer");
	BillionariesNameDataOperator.displayDetails();
	
	BillionariesNameDataOperator.update(5,"Michael Bloomberg");
	BillionariesNameDataOperator.displayDetails();
	
	boolean del1=BillionariesNameDataOperator.delete("Gautam Adani");
	System.out.println("Deleted: "+del1);
	BillionariesNameDataOperator.displayDetails();
	
	boolean del2=BillionariesNameDataOperator.delete(6);
	System.out.println("Deleted: "+del2);
	BillionariesNameDataOperator.displayDetails();
	
	System.out.println("main end");
}
}