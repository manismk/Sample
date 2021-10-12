import java.util.*;

interface Speakable
{
	//void add(int a , int b);
	int add();
}

class Lambda2
{
	public static void main(String args[])
	{
		// Speakable s = new Speakable(){
		// 	public void speak()
		// 	{
		// 		System.out.println("This is the Speakable inteface");
		// 	}
		// };

		// Speakable s = ()->System.out.println("this is");
		// s.speak();

		//Speakable s = (a,b)->{System.out.println("Hello");
		//					  System.out.println(a+b);};

		//Without return keyword
		//Speakable s = (a,b) ->a+b;

		//with return keyword
		//Speakable s = (a,b) ->{return a+b;};
		int a = 5 , b=10;
		Speakable s = () ->{return a+b;};

		System.out.println(s.add());
	}
}