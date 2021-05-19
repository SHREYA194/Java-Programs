import java.util.Scanner;
public class Divide23
{
 public static void main(String[] args)
 {
  Scanner num=new Scanner(System.in);
  System.out.print("Enter number:");
  int n=num.nextInt();
  if(n%2==0&&n%3==0)
  	System.out.println(n+" is divisible by 2 and 3");
  if(n%2==0||n%3==0)
  	System.out.println(n+" is divisible by 2 or 3");
  if(n%2==0&&n%3!=0||n%2!=0&&n%3!=0)
  	System.out.println(n+" is divisible by 2 or 3 but not both");
  }
}