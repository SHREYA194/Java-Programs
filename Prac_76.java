import java.util.*;
import java.math.BigInteger;

class Rational{
	BigInteger result;
	public BigInteger gcd(BigInteger n,BigInteger d){
		if(d==0){
			result=n;
			return result;
		}
		else{
			result=gcd(d,n%d);
			return result;
		}
	}
	
				
}
public class Prac_76{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal value:");
		String s= sc.next();
		String splits[]=s.split("[.]");
		int b= splits[1].length();
		BigInteger denominator = new BigInteger("10");
		BigInteger result=denominator.pow(b);  // power function with the use of Biginteger
		BigInteger numerator= s* denominator;
		int intnumerator=numerator.intValue();// typecasting in Biginteger
		Rational r = new Rational();
		BigInteger ans=r.gcd(numerator,denominator);
		String fraction = "  " + numerator/ans+ " / " + denominator/ans ;
		System.out.println(fraction);
	}
	
}
		
		
		
		