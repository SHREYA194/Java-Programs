public class PrimeNumber
{
 public static void main(String args[])
 {
  int i,j,k=1,count;
  for(i=2;i<=1000;i++)
  {
   count=0;
   for(j=1;j<=i;j++)
   {
    if(i%j==0)
   	count++;
   }
  if(count==2)
   {
     if(k<=8)
     {
	System.out.print(i+" ");
        k++;
     }
    if(k>8)
    {
     System.out.println();
     k=1;
    }
   }  
  }
 }
}
  
	
  