import java.util.Scanner;
public class DecreseThreeN
{
public static void main(String[] args)
{
  Scanner number=new Scanner(System.in);
  System.out.println("Enter three integer numbers:");
  int n1=number.nextInt();
  int n2=number.nextInt();
  int n3=number.nextInt();
  int temp;
	if(n1>n2 && n2>n3)
	{
	 temp=n3;
	 n3=n1;
	 n1=temp;
	  if(n2>n3)
	  {
	   temp=n3;
 	   n3=n2;
	   n2=temp;
	  }
	}
	if(n2>n1 && n1>n3)
	{
	 temp=n2;
	 n2=n3;
	 n3=temp;
	  if(n2<n1)
	  {
	   temp=n1;
	   n1=n2;
	   n2=temp;
	  }
	}
  System.out.println("Three numbers after decresing= "+n3+" "+n2+" "+n1);
}
}
		
