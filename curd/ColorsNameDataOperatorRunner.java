class ColorsNameDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	ColorsNameDataOperator.save("Black");
	ColorsNameDataOperator.save("Orange");
	ColorsNameDataOperator.save("Yellow");
	ColorsNameDataOperator.save("Green");
	ColorsNameDataOperator.save("Cyan");
	ColorsNameDataOperator.save("Blue");
	ColorsNameDataOperator.save("Grey");
	ColorsNameDataOperator.save("White"); //extara color err msg
	ColorsNameDataOperator.save("Red"); //length <=3 err msg
	ColorsNameDataOperator.displayDetails();
	boolean ref=ColorsNameDataOperator.findColor("Green");
	System.out.println("Color found: "+ref);
	System.out.println("main end");
}
}