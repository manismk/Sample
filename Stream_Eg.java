import java.util.*;
import java.util.stream.*;

class Stream_eg
{
	public static void main(String args[])
	{
//		ArrayList<Integer> num = new ArrayList<>();
//		num=Arrays.toList(1,2,3,4,5,5,6);
		List<Integer> num = new ArrayList<>();
		num=Arrays.asList(1,2,3,4,5,5,6);
		List<Integer> num1 = num.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(num1);
		List<Integer> num2 = num.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(num2);
	}
}