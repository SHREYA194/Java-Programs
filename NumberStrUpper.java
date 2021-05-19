import java.util.Scanner;
public class NumberStrUpper
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter a string:");
  String str=input.next();
  int count=0;
  for(int i=0;i<(str.length());i++)
  {
   if(Character.isUpperCase(str.charAt(i)))
       count++;
  }
 System.out.print("Number of Upper case letter in string="+count);
 }
}