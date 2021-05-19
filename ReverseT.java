import java.util.Scanner;
public class ReverseT
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter 10 numbers:");
  int[] arr=new int[10];
  for(int i=0;i<10;i++)
  {
   arr[i]=input.nextInt();
  }
  reverseNum(arr);
  System.out.print("Reverse numbers:");
  for(int i=0;i<10;i++)
  {
   System.out.print(arr[i]+" ");
  }
 }
 public static void reverseNum(int[] array)
 {
  int temp;
  for(int i=0,j=array.length-1;i<array.length/2;i++,j--)
  {
   temp=array[i];
   array[i]=array[j];
   array[j]=temp;
  }
 }
}
 