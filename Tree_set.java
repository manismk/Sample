import java.io.*;
import java.util.*;
import java.util.Iterator;
class Tree_set
{
	public static void main(String args[])
	{
		TreeSet<String> set1 = new TreeSet<String>();

		set1.add("Hello");
		set1.add("Hai");
		set1. add("How are you");

		TreeSet<String> set2 = new TreeSet<String>();

		set2.add("BKV");
		set2.add("RAM");
		set2. add("Shri Vignesh");
		System.out.println(set2);

		set2.addAll(set1);
		System.out.println(set2);		

		TreeSet set3 = new TreeSet();
		set3.add(45);
		set3.add(5.256);
		set3.add("Hello");
		set3.add('H');

		Iterator it = set2.descendingIterator();
		Iterator it = set3.Iterator();

		while(it.hasNext())
			System.out.println(it.next());

		set2.clear();
		System.out.println(set2);

		 set2 = (TreeSet<String>)set1.clone();		
		 System.out.println(set2+""+set1.size());
	}
}