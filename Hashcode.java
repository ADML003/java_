import java.io.*;
public class Hashcode{

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");
      System.out.println("Hashcode for Str :" + Str.hashCode() );
      Integer i = new Integer("155");  
      int hashValue = i.hashCode();  
      System.out.println("Hash code Value for object is: " + hashValue); 
   }
}