import java.util.Scanner;
public class PatternA
{
 public static void main(String args[])
 {
  Scanner pat=new Scanner(System.in);
  System.out.print("Enter maximum number of row:");
  int num=pat.nextInt();
  int i,j;
  for(i=1;i<=num;i++)
  {
   for(j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   System.out.println();
  }
 }
}