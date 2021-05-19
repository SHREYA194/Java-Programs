package Welcome;
import java.util.Scanner;
public class CountString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String coustr=input.next();
        System.out.print("Number of letters in the string="+countLetters(coustr));
    }
    public static int countLetters(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch<=122 || ch>=98 || ch<=90 || ch>=65)
            {
                count++;
            }
        }
        return count;
    }  
}
