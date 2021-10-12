import java.util.*;


class Employee
{
	int id,sno;
	String name;
	Employee(int id ,int sno, String name)
	{
		this.id= id;
		this.sno = sno;
		this.name = name;
	}
}

class Arr_obj
{
	public static void main(String args[])
	{
		int id,sno;
		String name;
		ArrayList<Employee> emp = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			id = s.nextInt();
			sno = s.nextInt();
			name = s.next();		
			emp.add(new Employee(id ,sno, name));	
		}
		Collections.sort(emp,(o1,o2) -> o1.name.compareTo(o2.name));
		
		for(Employee i : emp)
		{
			System.out.println(i.id);
		}
	}
}