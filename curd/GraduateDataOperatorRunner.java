class GraduateDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	GraduateDataOperator.save("Manoj");
	GraduateDataOperator.save("Avinash");
	GraduateDataOperator.save("Uday");
	GraduateDataOperator.save("Sandeep");
	GraduateDataOperator.save("Vinayak");
	GraduateDataOperator.save("Yashas");
	GraduateDataOperator.displayDetails();
	System.out.println("main end");
}
}