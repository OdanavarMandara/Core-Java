class MiPhoneRunner
{
	public static void main(String[] args)
	{
		MiPhone miphone=new MiPhone();
		miphone.setBrand("aa");
		System.out.println(miphone.brand);
		
		miphone.setPrice(100);
		System.out.println(miphone.price);
		
		miphone.setColor("black");
		System.out.println(miphone.brand);
		
		miphone.setImei(20);
		System.out.println(miphone.imei);
		
		
		PhonePay phonePay=new PhonePay();
		phonePay.setCompany("xxx");
		System.out.println(phonePay.company);
		
		phonePay.setVersion(20);
		System.out.println(phonePay.version);
		
		phonePay.setArchitect("yyy");
		System.out.println(phonePay.architect);
		
		phonePay.setWorking(false);
		System.out.println(phonePay.working);
	}
}