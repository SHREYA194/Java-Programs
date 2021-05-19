package javaapplication3;
import java.util.Scanner;
public class MinTwoArr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of two dimentional array #format-rowsize columnsize# : ");
        int rsize = input.nextInt();
        int csize = input.nextInt();
        Integer[][] twoArr = new Integer[rsize][csize];
        System.out.print("Enter "+rsize*csize+" values of two dimentional array : ");
        for(int i=0;i<rsize;i++) {
            for(int j=0;j<csize;j++) {
                twoArr[i][j] = input.nextInt();
            }
        }
        System.out.println("Minimum element in two dimentional array = "+MinTwoArr.<Integer>minimum(twoArr));
    }
    
    public static <T extends Comparable<T>> T minimum(T[][] arr) {
        T min = arr[0][0];
        for(T[] elements : arr) {
            for(T element : elements) {
                if(element.compareTo(min)<0)
                    min=element;
            }
        } 
        return min;
    }
}
