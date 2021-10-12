import java.util.*;

class Linked_list
{
	public static void main(String args[])
	{
		// LinkedList<Integer> list = new LinkedList<>();
		// list.add(1);
		// list.add(2);
		// list.add(3);
		// list.addFirst(5);
		// list.add(2,545);
		// for(int i : list)
		// 	System.out.println(i);

		LinkedList<String>list1 = new LinkedList<>();
		list1.add("vicky");
		list1.add("Rams");
		list1.add("ajay");
		list1.add("mani");
		list1.add(1,"BKV");
		for(String i : list1)
		 	System.out.println(i);
		 list1.addLast("WhoAMI");
		//Using iterator to iterate from the specified element.

		// Iterator i = list.listIterator(2);
		// for(;i.hasNext();)
		// 	System.out.println(i.next());	

		 // //Using Iterator to print the list elements in descending order.
		 // Iterator i = list1.descendingIterator();

		 // for(;i.hasNext();)
		 // 	System.out.println(i.next());
		 // System.out.println("The capacity of the list is"+list1.size());

		 // System.out.println("The first element of the list is"+list1.getFirst());
 		//  System.out.println("The first element of the list is"+list1.getLast());

 		//  //Join two linked lists.
 		//  LinkedList<String>list2 = new LinkedList<>();
 		//  list2.add("Gobi");
		 // list2.add("Modachur");
		 // list2.add("TNPalayam");
		 // list1.addAll(1,list2);
		 // System.out.println(list1);

		 // list2.clear();
		 // System.out.println(list2);		 

		 // Collections.shuffle(list1);
		 // System.out.println(list1);
		 // LinkedList<String> l2 = (LinkedList<String>)list1.clone();
		 // System.out.println(l2);

		 // System.out.println(list1);
		 // list1.pop();
		 // System.out.println(list1);

		 // System.out.println(list1);
		 // list1.peekFirst();
		 // System.out.println(list1.peekFirst());

		 //System.out.println(list1.contains("BK"));

		 ArrayList<String> alist = new ArrayList<String>(list1);
		 LinkedList<String> llist = new LinkedList<>(alist);
		 System.out.println(alist);
	//	 llist.clear();
		 System.out.println(llist.isEmpty());
		 llist.set(0,"hdflksdjfklsd");
		 System.out.println(llist);
		 System.out.println(alist.contains("vicky"));

		 LinkedList<String> l3 = new LinkedList<>();
		 for(String j : list1)
		 {
		 		l3.add(llist.contains(j) ? "true" : "false");
		 }
		 System.out.println(l3);

	}
}