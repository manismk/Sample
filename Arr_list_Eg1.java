import java.util.*;

class Arr_list_Eg1
{
	public static void main(String[] args)
	{
		ArrayList<String> colors = new ArrayList<>();

		// for(int i=0; i<5; i++)
		// {
		// 	Scanner s = new Scanner(System.in);
		// 	String s1 = s.nextLine();
		// 	colors.add(s1);
		// } 
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("red");
		colors.add(0,"pink");
//		System.out.println(colors);
//		Collections.sort(colors);	
		// for(String i : colors)
		// 	System.out.println("**"+i);	

		System.out.println(colors.get(1));
//		System.out.println(colors.get(6));	
		colors.set(2,"white");
		System.out.println(colors);
		colors.remove(2);
		System.out.println(colors);
	// Search the value
//		if(colors.contains("pink"))
//			System.out.println("The given color exist");
	// copy an arraylist
		// ArrayList<String> l2 = new ArrayList<>();
		// Collections.copy(colors,l2);
		// System.out.println(l2);

	// Shuffle the elements in an array
		// Collections.shuffle(colors);
		// for(String i : colors)
		// 	System.out.println(i);

	// Reverse the elements in a list
		// Collections.reverse(colors);
		// System.out.println(colors);

	//Cloning an array list
	// 	ArrayList<String> l2 = new ArrayList<>();
	// 	l2 = (ArrayList<String>)colors.clone();
	// 	System.out.println("**"+l2); 
	// 	l2.removeAll(l2);
	// //Empty the array list
	// 	System.out.println("**"+l2);

	//Sublist 
		// List<String> l2 =  colors.subList(0,2);
		// System.out.println(l2);

	//List is empty or not
	// System.out.println(colors.isEmpty());
	// colors.removeAll(colors);
	// System.out.println(colors.isEmpty());

	 //ArrayList<String> c2 = (ArrayList<String>)colors.clone();
	 //System.out.println(c2);
	// Collections.swap(c2,0,3);
	 //System.out.println(colors);
	 //ArrayList<String> c1 = new ArrayList<String>();

	 // for(String i : c2)
	 // 	c1.add(colors.contains(i) ? "true" : "false");
	 // System.out.println(c1);

	 ArrayList<String> c2 = (ArrayList<String>)colors.clone();
	 System.out.println(c2);
	 colors.addAll(c2);
	 System.out.println(colors);
	 for(int i=0;i<colors.size();i++)
	 	System.out.println(colors.get(i));
	 System.out.println(colors.size());
	}

}