import java.util.Scanner;
public class PatternC
{
 public static void main(String args[])
 {
  Scanner pat=new Scanner(System.in);
  System.out.print("Enter maximum number of row:");
  int num=pat.nextInt();
  int i,j,k;
  for(i=1;i<=num;i++)
  {
   for(j=num-1;j>=i;j--)
   {
    System.out.print(" ");
   }
   for(k=i;k>=1;k--)
   {
     System.out.print(k);
   }
   System.out.println();
  }
 }
}