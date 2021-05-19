import java.util.Scanner;
public class ComputeBMI
{
 public static void main(String[] args)
 {
  Scanner obmi=new Scanner(System.in);
  System.out.println("Enter weight in pound:");
  double wp=obmi.nextDouble();
  System.out.println("Enter height in inches:");
  double hi=obmi.nextDouble();
  final double kgperpound=0.45359237;
  final double mperinch=0.0254;
  double bmi=(wp*kgperpound)/(hi*mperinch);
  System.out.println("BMI="+bmi);
 }
}