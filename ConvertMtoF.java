import java.util.Scanner;
public class ConvertMtoF
{
  public static void main(String[] args)
   {
     final double mperfeet=0.305;
     Scanner meter=new Scanner(System.in);
     System.out.println("enter number in meter:"); 
     double m=meter.nextDouble();
     double f=m*mperfeet;
     System.out.println("Number in feet="+f);
   }
}