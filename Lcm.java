import java.util.Scanner;
public class Lcm
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter a number:");
  int n=input.nextInt();
  System.out.print("Division numbers=");
  int i=2;
  while(i<=n)
  {
   if(n%i==0)
   {
    System.out.print(" "+i);
    n=n/i;
   }
   else
	i++;
  }
 }
}
 