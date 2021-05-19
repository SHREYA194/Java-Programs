import java.util.Scanner;
public class GCD
{
 public static void main(String args[])
 {
   Scanner input=new Scanner(System.in);
   System.out.print("Enter max no. of input:");
   int n=input.nextInt();
   int[] arr=new int[n];
   System.out.print(" Enter inputs : ");
  for(int i=0;i<n;i++)
  {
    arr[i]=input.nextInt();
   }
  int gcd=gcd(arr);
 System.out.println("GCD = "+gcd);
 }
public static int gcd(int[] ar)
{
  int gc=ar[0];
  int i=1;
  while(i<ar.length)
  {
    if(ar[i]%gc==0)
    {
      i++;
     }
   else
   {
     gc=ar[i]%gc;
     i++;
   }
}
return gc;
}
}
 
   