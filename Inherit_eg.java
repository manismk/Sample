interface Car
{
	 int a=500;
	void drive();
}
class Toyato implements Car
{
	public void drive()
	{
		System.out.println("The Toyato class is called");
				System.out.println(a);
	}
}
class Inherit_eg 
{
	public static void main(String args[])
	{
		Car car1 = new Toyato();
		car1.drive();

	}
}

