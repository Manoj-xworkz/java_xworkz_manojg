class TempleDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	TempleDataOperator.save("Badrinath");
	TempleDataOperator.save("Somnath");
	TempleDataOperator.save("Kedarnath");
	TempleDataOperator.save("Dharmasthala");
	TempleDataOperator.save("Vaishno Devi");
	TempleDataOperator.save("Kanchipuram");
	TempleDataOperator.displayDetails();
	System.out.println("main end");
}
}