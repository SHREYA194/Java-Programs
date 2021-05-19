import java.util.Scanner;
public class RevNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();
        reverse(num);
    }
    public static void reverse(int number) {
        int out=0,i=0;
        while(number!=0)
        {
          System.out.print(number%10);
          number=number/10;
        }
    }
    
}
