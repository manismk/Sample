import java.io.*;
import java.util.*;

class Stack
{
	int a[] = new int[12];
	int top;

	Stack()
	{
		top = -1;
	}

	void push(int pu)
	{
		if(!(top>10))
			a[++top] = pu;
		else
			System.out.println("The stack overflows");
	}

	int pop()
	{
		int po=0;
		if(!(top == -1))
			po = a[top--];
		else 
			System.out.println("The stack overflows");
		return po;
	}

	void all()
	{
		for(int i=0; i<=top ; i++)
			System.out.println(a[i]+"\n");
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Stack st = new Stack();
		int pu,po;
		for(int i=0 ; i<6 ;i++)
		{
			System.out.println("\nEnter the stack options");
			int opt = s.nextInt();
			
			switch(opt)
			{
				case 1 : System.out.println("\nEnter the element to be pushed");
						 pu = s.nextInt();
						 st.push(pu);
						 break;

				case 2 : po = st.pop();
						 break;

				case 3 : System.out.print("The elements of the stack are");
						 st.all();
						 break;
				default : System.exit(0);
			}
		}
		
	}
}

