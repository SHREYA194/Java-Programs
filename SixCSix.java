public class SixCSix
{
 public static void main(String[] args)
 {
  int[][] arr=new int[6][6];
  for(int i=0;i<arr.length;i++)
  {
   for(int j=0;j<arr.length;j++)
   {
    arr[i][j]=(int)Math.random() * 2;
    System.out.print(arr[i][j] + " ");
   }
  System.out.println();
  }
 System.out.println("Every row"+(isAllRowEvents(arr) ? " " : "does not") + "have an even no. of 1's");
 System.out.println("Every column"+(isAllColumnEvents(arr) ? " " : "does not") + "have an even no. of 1's");
 }
public static boolean isAllRowEvents(int[][] m)
{
 for(int i=0;i<m.length;i++)
 {
  int count=0;
  for(int j=0;j<m.length;j++)
  {
   if(m[i][j]==1)
   	count++;
  }
 if(count%2!=0)
 	return false;
 }
 return true;
}
public static boolean isAllColumnEvents(int[][] m)
{
 for(int i=0;i<m.length;i++)
 {
  int count=0;
  for(int j=0;j<m.length;j++)
  {
   if(m[j][i]==1)
   	count++;
  }
  if(count%2!=0)
  	return false;
 }
 return true;
}
}