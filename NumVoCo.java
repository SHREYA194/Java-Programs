import java.util.Scanner;
public class NumVoCo
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter a string:");
  String str=input.next();
  int count=0,cou=0;
  for(int i=0;i<str.length();i++)
  {
   char c=Character.toUpperCase(str.charAt(i));
   if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
   	count++;
   else
    	cou++;
  }
 System.out.print("Number of Vowel="+count+" and Consonant="+cou);
 }
}