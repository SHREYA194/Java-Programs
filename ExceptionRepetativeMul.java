public class ExceptionRepetativeMul {
    public static void main(String[] args) {
        try
        {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
            int repmul=1;
            for(int i=0;i<Math.abs(y);i++) {
                repmul=repmul * x;
            }
            if(y<0) {
                double rep=1.0/repmul;
                System.out.printf("%d ^ %d = %f",x,y,rep);
            }
            else {
            System.out.printf("%d ^ %d = %d",x,y,repmul);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter integer numbers only...."+e);
        }
    }    
}