import java.io.*;
import java.lang.*;
import java.util.*;

class SampleCollection
{
	public static void main(String args[])
	{
	// 	ArrayList<Integer> values = new ArrayList<>();
	// 	int j=5;
	// 	//ArrayList values = new ArrayList();
	// 	values.add(5);
	// 	values.add(6);
	// //	System.out.println(values);
	// 	//Iterator itr = values.iterator();
	// 	for(Integer i : values)
	// 	{
	// 		if(i==j)
	// 			System.out.println("helo");
	// 		System.out.println(i);
	// 	}
		Scanner s = new Scanner(System.in);
		ArrayList<Laptop> laps = new ArrayList<>();
		Laptop lap[] = new Laptop[4];
		for(int i=0;i<4;i++)
		{			
			lap[i] = new Laptop();
			laps.add(lap[i]);
		}
		for(Laptop i : laps)
		{
			i.read();
			i.write(1);
			System.out.println(i);
		}
		System.out.println(laps.size());
	}
}

class Laptop
{
	int a;
	String b;
	void read()
	{
		System.out.println("Reading is called");
	}
	void write(int a)
	{
		this.a = a ;
		System.out.println("The written element is "+a);
	}

}