import java.util.Scanner;
public class AreaofHexagon
{	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of length:");
		int s=sc.nextInt();
		final double pi=3.14159;		
		System.out.println("The formula is : (6*s*s)/(4*tan(pi/6))");
		System.out.println("The Area is:"+(6*s*s)/(4*Math.tan(pi/6)));
System.out.println(Math.tan(pi/6));
	}
}
