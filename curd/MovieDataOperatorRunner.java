class MovieDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	MovieDataOperator.save("Dangal");
	MovieDataOperator.save("3 Idiots");
	MovieDataOperator.save("Bhaag Milkha Bhaag");
	MovieDataOperator.save("Hera Pheri");
	MovieDataOperator.save("Gully Boy");
	MovieDataOperator.save("Bajirao Mastani");
	MovieDataOperator.displayDetails();
	System.out.println("main end");
}
}