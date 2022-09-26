class FoodItemsDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	FoodItemsDataOperator.save("Palak paneer");
	FoodItemsDataOperator.save("Masala dosa");
	FoodItemsDataOperator.save("Chaat");
	FoodItemsDataOperator.save("Dal makhani");
	FoodItemsDataOperator.save("Vada pav");
	FoodItemsDataOperator.save("Stuffed paratha");
	FoodItemsDataOperator.displayDetails();
	System.out.println("main end");
}
}