import java.util.Scanner;
public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of triangle:");
        double s1 = input.nextInt();
        double s2 = input.nextInt();
        double s3 = input.nextInt();
        System.out.println(isValid(s1,s2,s3)?"Area of Triangle="+area(s1,s2,s3):"The input is invalid");
    }
   public static boolean isValid(double side1,double side2,double side3) {
       if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
           return true;
       else
           return false;
   }
   public static double area(double side1,double side2,double side3) {
       double s=(side1+side2+side3)/2;
       return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
   }
}
