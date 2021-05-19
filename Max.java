package Welcome;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d;
        if(a>b&&a>c)
            d=a;
        else if(b>a&&b>c)
            d=b;
        else
            d=c;
        System.out.println("maximum="+d);
    }   
}
