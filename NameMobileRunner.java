class NameMobileRunner{

	public static void main(String[] digit)
	{
		
		long mobile1=9110819083L;
		long mobile2=8088245073L;
		long mobile3=9071177871L;
		long mobile4=9071187543L;
		long mobile5=8277401085L;
		long mobile6=7337686718L;
		long mobile7=9008284717L;
		long mobile8=8310894408L;
		long mobile9=7483735838L;
		long mobile10=7019406887L;
		
		String ref1=NameMobile.getNameByMobile(mobile1);
		System.out.println("passed mobile number:"+mobile1+" obtained name is:"+ref1);
		
		String ref2=NameMobile.getNameByMobile(mobile2);
		System.out.println("passed mobile number:"+mobile2+" obtained name is:"+ref2);
		
		String ref3=NameMobile.getNameByMobile(mobile3);
		System.out.println("passed mobile number:"+mobile3+" obtained name is:"+ref3);
		
		String ref4=NameMobile.getNameByMobile(mobile4);
		System.out.println("passed mobile number:"+mobile4+" obtained name is:"+ref4);
		
		String ref5=NameMobile.getNameByMobile(mobile5);
		System.out.println("passed mobile number:"+mobile5+" obtained name is:"+ref5);
		
		String ref6=NameMobile.getNameByMobile(mobile6);
		System.out.println("passed mobile number:"+mobile6+" obtained name is:"+ref6);
		
		String ref7=NameMobile.getNameByMobile(mobile7);
		System.out.println("passed mobile number:"+mobile7+" obtained name is:"+ref7);
		
		String ref8=NameMobile.getNameByMobile(mobile8);
		System.out.println("passed mobile number:"+mobile8+" obtained name is:"+ref8);
		
		String ref9=NameMobile.getNameByMobile(mobile9);
		System.out.println("passed mobile number:"+mobile9+" obtained name is:"+ref9);
		
		String ref10=NameMobile.getNameByMobile(mobile10);
		System.out.println("passed mobile number:"+mobile10+" obtained name is:"+ref10);
	}
}
