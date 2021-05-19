import java.util.Scanner;
public class GC 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int answer=gcd(n1,n2);
        System.out.println("GCD of "+n1+"and "+n2+"="+answer);
    }
    public static int gcd(int num1,int num2)
    {
        int gc=1;
        for(int i=1;i<=num1&&i<=num2;i++)
        {
          if(num1%i==0&&num2%i==0)
          {
              gc=i;
          }
        }

        return gc;
    } 
}