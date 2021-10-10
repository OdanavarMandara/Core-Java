class TubeLightStarter
{
	public static void main(String[] args)
	{
		TubeLight light=new TubeLight();
		//String memory=light.name;
		String name=light.getName();
		System.out.println("Tube Light is "+name);
		light.setWatts(20);
		int watts=light.getWatts();
		System.out.println("Tube Light watts is "+watts);
	}
}