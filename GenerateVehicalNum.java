public class GenerateVehicalNum
{
 public static void main(String args[])
 {
  System.out.print("Vehical number : ");
  for(int i=0;i<7;i++)
  {
   if(i<=2)
    	System.out.print((char)(65+Math.random()*(90-65)));
   if(i>2)
    	System.out.print((int)(Math.random()*10));
  }
 }
}