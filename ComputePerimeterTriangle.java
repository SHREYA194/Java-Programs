import java.util.Scanner;
public class ComputePerimeterTriangle{
public static void main(String[] args){
	Scanner edge=new Scanner(System.in);
	System.out.println("Enter three edges:");
	double edge1=edge.nextDouble();
        double edge2=edge.nextDouble();
	double edge3=edge.nextDouble();
	double perimeter;
	if((edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge1 + edge3 > edge2))
	{
	 	perimeter = edge1 + edge2 + edge3;
	 	System.out.print("Triangle perimter="+perimeter);
	}
	else
		System.out.println("The input is invalid.");
}
}
