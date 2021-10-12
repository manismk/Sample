import java.util.*;
import java.util.function.*;
class Employee
{
	String name;
	int marks;

	Employee(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
}

class Function_eg1
{
	public static void main(String args[])
	{
		List<Employee> emp = new ArrayList<Employee>();
		emp = Arrays.asList(new Employee("vicky",55),new Employee("vardhini",96), new Employee("Rams",86));
		Function<List<Employee>,Integer> total = e ->{
				int total1 =0;
				for(Employee e1 : e)
				{
					total1 = total1 + e1.marks;
				}	
				return total1;
		};
		System.out.println(total.apply(emp));

		Function<Employee, Integer> inc = e -> e.marks = e.marks + 40;

		Predicate<Employee> p = e -> e.marks < 100;

		for(Employee e2 : emp)
		{
			if(p.test(e2))
			{
				int mark1 = inc.apply(e2);
				System.out.println(mark1);
			}
		}
	}
}