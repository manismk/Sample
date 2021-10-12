import java.util.*;

interface Operations
{
	void add(int a, int b);

}

// class Sample implements Operations
// {
// 	public void add(int a ,int b)
// 	{
// 		System.out.println(a+b);
// 	}
// }
class Lambda1 
{
	public static void main(String args[])
	{
		// Operations o = new Sample()
		// {
		// 	public void add(int a ,int b)
		// 	{
		// 		System.out.println(a+b);
		// 	}
		// };

		Operations o = (a,b) -> {
			System.out.println(a+b);
		};
		o.add(12,45);
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		al.forEach(i -> System.out.println(i));

	}
}