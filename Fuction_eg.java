import java.util.*;
import java.util.function.*;
class Sample
{
	int sqre(Function<Integer,Integer> fun , int s)
	{
		return fun.apply(s);
	}
}
class Fuction_eg
{
	public static void main(String args[])
	{
		String s = "Vignesh";
		Function<String,Integer> len = l -> l.length();
		System.out.println(len.apply(s));	

		Sample s1 = new Sample();
		Function<Integer,Integer> len1 = l -> l*l;
		int ans = s1.sqre(len1,55);
		System.out.println(ans);

		
	}
	
}