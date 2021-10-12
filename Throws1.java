import java.io.*;  
class M{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
  throw new IOException("device error");
 }  
}  
class Throws1{  
   public static void main(String args[])throws IOException{
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  

// import java.io.*;  
// class M{  
//  void method()throws IOException{  
//   throw new IOException("device error");  
//  }  
// }  
// public class Throws1{  
//    public static void main(String args[]){  
//     try{  
//      M m=new M();  
//      m.method();  
//     }catch(Exception e){System.out.println("exception handled");}     
  
//     System.out.println("normal flow...");  
//   }  
// }