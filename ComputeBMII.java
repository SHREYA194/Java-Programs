import java.util.Scanner;
public class ComputeBMII
{
 public static void main(String args[])
 {
  Scanner com=new Scanner(System.in);
  System.out.print("Enter weight and height:");
  double wpound=com.nextDouble();
  double hinch=com.nextDouble();
  double bmi=(wpound*(0.45359237))/(hinch*(0.0254)*hinch*(0.0254));
  System.out.print("BMI="+bmi+" and status :");
  if(bmi<18.5)
	System.out.print("Underweight");
  else if(bmi<25&&bmi>18.5)
	System.out.print("Normal");
  else if(bmi<30&&bmi>25)
	System.out.print("Overweight");
  else
	System.out.print("Obese");
  }
}