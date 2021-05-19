package javaapplication3;

import java.util.Scanner;
import java.math.BigInteger;

public class Prac_76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        String decimal = input.nextLine();
        //System.out.println(StringUtils.countMatches(decimal,".")>1 ? "Please enter decimal number.":"");
        String deci = decimal.contains(".") ? decimal : decimal.concat(".0");
        //try {
         
          String[] arr = deci.split("[.]");
          for(String a : arr)
                System.out.println(a);
   
              
          if(arr.length==2) {
              String p = deci.replace(".","");
          
          System.out.println(p);
          System.out.println(arr[1].length());
          //Rational r=new Rational();
          Rational1 r1=new Rational1(new BigInteger(p),arr[1].length());
          System.out.println(/*r.generateNomDenom()+"\n"+*/decimal+" = "+r1.generateNomDenom());
          }
          else
              System.out.println("Please enter decimal number.");
        //}
        /*catch(ArrayIndexOutOfBoundsException e) {
            String deci=decimal.concat(".0");
            String[] arr = deci.split("[.]");
            String p = deci.replace("[.]","");
            Rational r1=new Rational(new BigInteger(p),arr[1].length());
            System.out.println(/*r.generateNomDenom()+"\n"+*/ /*decimal+" = "+r1.generateNomDenom());
        }*/
    
        //catch(NumberFormatException e) {
          //  System.out.println("Please enter decimal number.");
        //}
        
        
       
        
    }
}
class Rational1 {
    private BigInteger m;
    int n;
    public Rational1() {
        this(BigInteger.ZERO,0);
    }
    public Rational1(BigInteger m,int n) {
        this.m=m;
        this.n=n;
    }
    public String generateNomDenom() {
        
        BigInteger a=m.gcd(BigInteger.TEN.pow(n));
        //return m+"/10^"+n+"\nGCD "+a+"\nANS: "+m.divide(a)+" / "+BigInteger.TEN.pow(n).divide(a);
        return m+"/10^"+n+" = "+m.divide(a)+"/"+BigInteger.TEN.pow(n).divide(a);
    }
    public BigInteger getM() {
        return m;
    }
    public int getN() {
        return n;
    }
}
