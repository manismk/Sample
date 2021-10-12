public class Exception_1 {  
  
    public static void main(String[] args) {  
          try
          {
	        int data=50/0; //may throw exception   

          }
    	catch(ArithmeticException e)
    	{
    		System.out.println("hai");
    	}      
        System.out.println("rest of the code");  
          
    }  
      
}  