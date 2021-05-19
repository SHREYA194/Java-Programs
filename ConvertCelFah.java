import java.util.Scanner;
public class ConvertCelFah {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter temperature in celsius:");
        double cel=input.nextDouble();
        CelAndFah in1=new CelAndFah();
        System.out.println(cel+" Celsius= "+in1.celToFah(cel));
        System.out.print("Enter temperature in Fahrenheit:");
        double fah=input.nextDouble();
        CelAndFah in2=new CelAndFah();
        System.out.print(fah+" Fahrenheit= "+in2.fahToCel(fah));
    }
}
class CelAndFah {
    public double celToFah(double celsius)
    {
        return (9.0/5 * celsius + 32);
    }
    public double fahToCel(double fahrenheit)
    {
        return (5.0 / 9 * fahrenheit - 32);
    }
}
