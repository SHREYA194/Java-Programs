import java.util.Scanner;
public class ComputeDistance
{
 public static void main(String[] args)
 {
  Scanner dis=new Scanner(System.in);
  System.out.println("Enter x1,y1,x2 and y2:");
  int x1=dis.nextInt();
  int y1=dis.nextInt();
  int x2=dis.nextInt();
  int y2=dis.nextInt();
  double d=Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),0.5);
  System.out.println("distance="+d);
 }
}