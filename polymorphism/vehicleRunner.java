class vehicleRunner{

	public static void main(String[] India)
	{
		double ref1=Vehicle.transport("banglore","shimoga");
		System.out.println("distance: "+ref1+"km");
		
		double ref2=Vehicle.transport("banglore","davangere");
		System.out.println("distance: "+ref2+"km");
		
		double ref3=Vehicle.transport("banglore","hubli",true);
		System.out.println("distance: "+ref3+"km");
		
		double ref4=Vehicle.transport("banglore","tumkur",false);
		System.out.println("distance: "+ref4+"km");
		
		double ref5=Vehicle.transport("dharwad");
		System.out.println("distance: "+ref5+"km");
		
		double ref6=Vehicle.transport("gokarna");
		System.out.println("distance: "+ref6+"km");
		
		double ref7=Vehicle.transport("tirpur",true);
		System.out.println("distance: "+ref7+"km");
		
		double ref8=Vehicle.transport("mumbai",true);
		System.out.println("distance: "+ref8+"km");
		
		double ref9=Vehicle.transport(true);
		System.out.println("delayed by: "+ref9+"min");
		
		double ref10=Vehicle.transport(false);
		System.out.println("delayed by: "+ref10+"min");
		
		
	}

}