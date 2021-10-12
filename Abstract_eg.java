import java.util.*;

interface Abeg
{
	void draw();
	void sketch();
}

abstract class Sample implements Abeg
{
	public void draw()
	{
		System.out.println("Draw method in abstract class is called");
	}
}

class Sample1 extends Sample
{
	public void sketch()
	{
		System.out.println("The sketch method is called");
	}
}
class Abstract_eg 
{
	public static void main(String args[])
	{
//		Sample s = new Sample1();
		Abeg s = new Sample1();
		s.draw();
		s.sketch();
	}
}