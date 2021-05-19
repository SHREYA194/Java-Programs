//package javaapplication3;

import java.util.Scanner;
import java.math.BigInteger;

public class DeciToFrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        String decimal = input.nextLine();
        String deci = decimal.contains(".") ? decimal : decimal.concat(".0");  
        String[] arr = deci.split("[.]");
        if(arr.length==2) {
            String p = deci.replace(".","");
            Rational r1=new Rational(new BigInteger(p),arr[1].length());
            System.out.println(decimal+" = "+r1.generateNomDenom());
        }
        else
            System.out.println("Please enter decimal number.");
    }
}
class Rational {
    private BigInteger m;
    int n;
    public Rational() {
        this(BigInteger.ZERO,0);
    }
    public Rational(BigInteger m,int n) {
        this.m=m;
        this.n=n;
    }
    public String generateNomDenom() {
        
        BigInteger a=m.gcd(BigInteger.TEN.pow(n));
        return m+"/10^"+n+" = "+m.divide(a)+"/"+BigInteger.TEN.pow(n).divide(a);
    }
    public BigInteger getM() {
        return m;
    }
    public int getN() {
        return n;
    }
}

