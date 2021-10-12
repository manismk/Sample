// import java.io.*;
// import java.util.*;
interface Bank
{
	public default void rateOfInterest()
	{
		System.out.println("The rate of interest at a normal percentage is 5%");
	}
}

interface Loan
{
	default void rateOfInterest()
	{
		System.out.println("This is sample");
	}
}

class SBI implements Bank,Loan
{

	public void rateOfInterest()
	{
			Bank.super.rateOfInterest();
			Loan.super.rateOfInterest();
			System.out.print("The rate of interest at a normal percentage is 7%");	
	}

}

class Interface_8
{
	public static void main(String args[])
	{
		Bank sbi = new SBI();
		sbi.rateOfInterest();
	}
}


// interface GfG{
//    public default void display()
//    {
//       System.out.println("GEEKSFORGEEKS");
//    }
// }
  
// // Creating Interface Two
// interface gfg{
  
//    public default void display() 
//    {
//       System.out.println("geeksforgeeks");
//    }
// }
  
// public class InterfaceExample implements GfG,gfg {
  
// // Interfaces are Overrided
// public void display() {
    
//       GfG.super.display();
       
//       gfg.super.display();
//    }
  
// public static void main(String args[]) {
//       InterfaceExample obj = new InterfaceExample();
//       obj.display();
//    }
// }