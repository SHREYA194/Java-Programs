import java.util.Scanner;
public class ExceptionBi2De {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a binary string:");
        String s=in.nextLine();
        try {
            bin2Dec(s);
        }
        catch(NumberFormatException e) {
              System.out.println("String is not binary..."+e);
        }
    }
       public static void bin2Dec(String binString) {
           int dec=0;
        for(int i=0,j=binString.length()-1;i<binString.length();i++,j--) {
            if(binString.charAt(i) < '0' || binString.charAt(i) > '1') {
               throw new NumberFormatException("enter binary string.."); 
            }
            else {
                dec+=(Integer.parseInt(String.valueOf(binString.charAt(i)))) * Math.pow(2, j);
        }
        }
        System.out.println("Decimal number = "+dec);
       }
}