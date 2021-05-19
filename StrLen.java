import java.util.Scanner;
public class StrLen
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter a string:");
  String str1=input.next();
  char ch=str1.charAt(0);
  int strlen=(int)str1.length();
  System.out.print("String length ="+ strlen +" and First character ="+ch);
 }
}  