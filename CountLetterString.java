import java.util.Scanner;
public class CountLetterString {
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
            if(Character.isLetter(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }  
}
