interface Car
{
	void drive();
}
interface Bike
{
	int a = 5;
	void drive();
}

class Hero implements Car,Bike
{
	public void drive()
	{
		System.out.println("Any of the interfaces can be called");
		//a=10;
		System.out.println(a);
	}
}

class Interface_override
{
	public static void main(String args[])
	{
		Hero h = new Hero();
		h.drive();
		Car c = new Hero();
		c.drive();
		Bike b = new Hero();
		b.drive();
	}
}