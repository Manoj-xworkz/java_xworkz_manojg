class PoliticanDataOperatorRunner{
public static void main(String[] names){
	System.out.println("Main start");
	PoliticanDataOperator.save("Narendra Modi");
	PoliticanDataOperator.save("Amit Shah");
	PoliticanDataOperator.save("Rajnath Singh");
	PoliticanDataOperator.save("Mamata Banerjee");
	PoliticanDataOperator.save("Sharad Pawar");
	PoliticanDataOperator.save("Arvind Kejriwal");
	PoliticanDataOperator.displayDetails();
	System.out.println("main end");
}
}