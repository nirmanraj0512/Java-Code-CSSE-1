// user defined exception example for student marks program if marks greater than maximum marks  than throw exception
import java.util.*;

public class p1 {
public static void main(String[] args)
{
{
Scanner in=new Scanner(System.in);
  int total_marks=0;
  int maximum=100;
 int s1[]=new int[5];
for(int i=0;i<5;i++)
{
  System.out.println("Enter marks out of 100: ");
  s1[i]=in.nextInt();
   try
  {
      if(s1[i]>maximum||s1[i]<0)
      {
          throw new ArithmeticException("Marks cannot be greater than maximum marks");
      }
      else
      {
          System.out.println("Marks are valid Input another marks");
      }
  }
  catch(ArithmeticException e)
  {
      System.out.println(e);
  }
  finally
  {
     
      total_marks=total_marks+s1[i];
 
}
 
}   
     System.out.println("total marks in this loop is "+total_marks);
}
}
}