import java.util.*;

// interface Eatable
// {
// 	void breakfast();
// }


// // class Sample
// // {
// // 	public static void breakfast1()
// // 	{
// // 		System.out.println("Hi I have eaten my breakfast");
// // 	}
// // }


// class MethodRef
// {
// 	public static void main(String args[])
// 	{
// //		Eatable e = new Sample();
// 		Eatable e = ()->Sample.breakfast1();

// 		//Eatable e = ()->{System.out.println("hello");};

// //		Eatable e = Sample::breakfast1; 
// 		e.breakfast();
// 	}
// }



// interface Sayable{  
//     void say();  
// }  
// public class MethodRef {  
//     public static void saySomething(){  
//         System.out.println("Hello, this is static method.");  
//     }  
//     public static void main(String[] args) {  
//         // Referring static method  
//         //Sayable sayable = MethodRef::saySomething;  
//         Sayable sayable = ()->{MethodRef.saySomething();};
//         // Calling interface method  
//         sayable.say();  
//     }  
// }  


// 	Reference to a non static method.



interface Eatable
{
	void breakfast();
}


class Sample
{
	public void breakfast1()
	{
		System.out.println("Hi I have eaten my breakfast");
	}
}


class MethodRef
{
	public static void main(String args[])
	{

		Eatable e = ()->new Sample().breakfast1();

		//Eatable e = ()->{System.out.println("hello");};

//		Eatable e = new Sample()::breakfast1; 
		e.breakfast();
	}
}