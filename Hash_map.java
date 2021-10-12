import java.util.HashMap;
import java.util.ArrayList;

class Hash_map
{
	public static void main(String args[])
	{
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1,"lemon");
		h1.put(2,"orange");
		h1.put(3,"mango");
		h1.put(4,"watermelon");
		h1.put(5,"guava");

		ArrayList<Integer> keys = new ArrayList<Integer>(h1.keySet());
		System.out.println(keys);

		for(Integer key : keys)
			System.out.println(h1.get(key));

			System.out.println(h1.get(1));

		if(h1.containsValue("lemon"))
			System.out.println("exists");

		if(h1.containsKey(1))
			System.out.println("exists");
	}
}