package javaapplication3;
import java.util.Scanner;

public class MinMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter maximum number of elements:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = input.nextInt();
        }
        int minimum = lowest(arr);
        System.out.print("Enter a number to multiply with minimum number of array:");
        int number = input.nextInt();
        System.out.println("Lowest number from 10 numbers="+minimum+"\n"+minimum+" * "+number+" = "+minimum*number);
    }
    
    private static int lowest(int[] a) {
        return lowest(a,0,a[0]);
    }
    
    private static int lowest(int[] a,int i,int low) {
        if(i==a.length)
            return low;
        if(low>a[i])
            low=a[i];
        return lowest(a,i+1,low);
    }
}
    