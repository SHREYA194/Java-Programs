import java.util.Scanner;
public class ConvertFAtoCE
{
  public static void main(String[] args)
   {
     Scanner fa=new Scanner(System.in);
     System.out.println("enter temperature in fahrenheit:"); 
     double fahrenheit=fa.nextDouble();
     double celsius=(5.0/9)*(fahrenheit-32);
     System.out.println("temperature in celsius="+celsius);
   }
}