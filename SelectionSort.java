import java.util.Scanner;
public class SelectionSort 
{
 public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter max no. of inputs:");
  int n=input.nextInt();
  System.out.println("Enter array elements:");
  double[] arr=new double[n];
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=input.nextDouble();
  }
 selectionSort(arr);
 }
public static void selectionSort(double[] list)
{
 for(int i=0;i<list.length-1;i++)
 {
  double current_min=list[i];
  int current_min_index=i;
  for(int j=i+1;j<list.length;j++)
  {
   if(current_min>list[j])  
   {
    current_min=list[j];
    current_min_index=j;
   }
  }
  if(current_min_index!=i)
  {
   list[current_min_index]=list[i];
   list[i]=current_min;
  }
 }
 for(int i=0;i<list.length;i++)
{
 System.out.print(list[i]+" ");
}
}
}