import java.util.*;
import java.util.function.*;


class Sample
{
	void startWithK(String[] name, Predicate<String> p)
	{
		for(String n : name)
			if(p.test(n))
				System.out.println(n);
	}
}
class Predicate_eg1
{
	public static void main(String args[])
	{

		//Program to add the elements into the list which has not null and its length greater than 0


		String[] sample = {"hai","","hello",null};
		Predicate<String> che = t -> t!= null && t.length()>0;
		ArrayList<String> names = new ArrayList<String>();

		for(String s : sample)
		{
			if(che.test(s))
				names.add(s);
		}
		System.out.println(names);

		//Program to find the names that start with k;

		String[] sample1 = {"kishore","kannan","mani","ajay"};
		Predicate<String> k = t -> t.charAt(0) == 'k';
		Sample s = new Sample();
		s.startWithK(sample1, k);

//Program to find the numbers based on the condition they satisfy and, or, negate;
		int number[]={1,2,2,34,45,6};
		Predicate<Integer> num = p -> p>10;
		Predicate<Integer> num1 = p -> p%2==0;

		for(int n : number)
		{
			if(num.and(num1).test(n))
				System.out.println(n);
			if(num.or(num1).test(n))
				System.out.println(n);
			if(num1.negate().test(n))
				System.out.println(n);
		}				
	}
}