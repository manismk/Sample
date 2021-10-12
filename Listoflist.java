import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Listoflist 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> inner = new ArrayList<>();
            
            int m = s.nextInt();
            for(int j = 0; j<m ;j++)
            {
                inner.add(s.nextInt());    
            }
            outer.add(inner);
        }
        int noOfIter = s.nextInt();
        ArrayList<Integer> inner;
        int row,col;
        for(int i=0;i<noOfIter;i++)
        {
            row = s.nextInt();
            col = s.nextInt();
            try
            {
            inner = outer.get(row-1);
            System.out.println(inner.get(col-1));
            }
            catch(Exception e)
            {System.out.println("ERROR!");}                
        }
    }
}