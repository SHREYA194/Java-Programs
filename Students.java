import java.util.Scanner;
class Student
{
	int regno;
	String name;
	int total;
	int sub1,sub2,sub3,s;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
			System.out.println("Enter the name of the student:");
			 name=sc.nextLine();
			System.out.println("Enter the PEN  no. of the student:");
			regno=sc.nextInt();
	}
	 void total()
	{	
		System.out.println("Enter the marks of sub1:");
		 sub1=sc.nextInt();
		System.out.println("Enter the marks of sub2:");
		 sub2=sc.nextInt();
		System.out.println("Enter the marks of sub3:");
		sub3=sc.nextInt();
		 s=sub1+sub2+sub3;
		
	}
	 void display()
	{
		System.out.println("Name : "+name +" Regno: "+regno+ " Total: "+s);
		System.out.println(" ");
	}
}		
public class Test5Student
{	
	public static void main(String args[])
	{
		
		Student stu[]=new Student[5];
		System.out.println(" Result of 5 students ");
		for(int i=0;i<5;i++)
		{
		        stu[i]=new Information();
			stu[i].getdata();
			stu[i].total();
		}
		for(int i=0;i<5;i++)
		{
			stu[i].display();
		}
	}
}
	 
