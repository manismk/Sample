import java.util.*;

// interface static_eg
// {
// 	static void add()
// 	{
// 		System.out.println("This is the eg for static method");
// 	}
// 	default void sub()
// 	{
// 		System.out.println("This is the sub method"+a);
// 	}
// }

class Sample 
{
	String name;
	static String clg = "KEC";
	static void add(int a)
	{
		//name="vignesh";
		System.out.println("The static method is being called"+a+clg);
	}
	Sample(String name)
	{
		this.name = name;
	}
	void printDetails()
	{
		clg ="Hello";
		System.out.println(name + clg );
	}
}

class Static_8 
{
	 static int a=10;
	static
	{
		System.out.println("The static method is been called"+a);
	}
	public static void main(String args[])
	{
//		int a=5;
		// static_eg.add();
		// static_eg s = new Sample();
		// s.sub();
		Sample.add(a);
		Sample s = new Sample("Vignesh");
		s.printDetails();
//		System.out.println(a);
	}
}