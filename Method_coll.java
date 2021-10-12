import java.util.*;


class Sample
{

}

class Method_coll
{
	public static void main(String args[])
	{
		List<Integer> num = new ArrayList<Integer>();
		num = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> num = Arrays.asList(1,2,3,2);
//		System.out.println(num);

//		num.forEach(i->System.out.println(i));
//		num.forEach(System.out::println);

//		num.forEach(i->{System.out.println(doublet1(i));});
//		num.forEach(i->doublet1(i));
		num.forEach(Method_coll::doublet1);
	}
	public static void doublet1(Integer i)
	{
			System.out.println(i*2);
			//return i*2;
	}
}