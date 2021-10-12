import java.util.*;
//import java.lang.*;
import java.io.*;
class Hash_set
{
	public static void main(String args[])
	{
		Set<String> s1 = new HashSet<String>();

		s1.add("hello");
		s1.add("hai");
		s1.add("greetings");
		s1.add("hai");

		System.out.println(s1);

		for(String i : s1)
			System.out.println(i);

		LinkedList<String>list1 = new LinkedList<>();
		list1.add("vicky");
		list1.add("Rams");
		list1.add("ajay");
		list1.add("mani");
		list1.add("mani");
		list1.add("mani");
		list1.add(1,"BKV");
		System.out.println("This list is"+list1);
		HashSet<String> s2 = new HashSet<String>(list1);
		System.out.println("This set is"+s2);
		System.out.println("The size of the hash set is "+s2.size());
		// Set<String>s3 = new TreeSet<String>(s2);
		// System.out.println("This Tree set is"+s3);
		// //s2.removeAll(s2);
		// System.out.println("This set is"+s2);
		// System.out.println("This set is empty or not "+s2.isEmpty());
		HashSet<String>s4 = new HashSet<String>();
		s4 = (HashSet<String>)s2.clone();
		System.out.println(s4);
		String s[] = new String[s4.size()];
		s4.toArray(s);

		//Converting Hash set to array
		for(String i : s)
			System.out.println(i);
		//Converting Hash set to Tree set
		TreeSet<String> t1 = new TreeSet<String>(s4);
		System.out.println(t1);
		//Converting Hash set to ArrayList
		ArrayList<String> al = new ArrayList<String>(s4);
		System.out.println(al);
		//Comparing two Hash Sets
		HashSet<String> s5 = new HashSet<String>();
		for(String i : s4)
			System.out.println(s2.contains(i) ? "true" : "false");
		//System.out.println(s5);
		System.out.println(s4);
		System.out.println(s2);
		s4.retainAll(s2);
		System.out.println(s4);
		s4.removeAll(s4);
		System.out.println(s4);
	}
}