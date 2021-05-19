public class CustomException {
    public static void main(String[] args) {
        int[] a=new int[args.length];
        for(int i=0;i<args.length;i++) {
            a[i]=Integer.parseInt(args[i]);
        }
            int sum=0;
        for(int i=0;i<a.length;i++) {
             try {
            if(a[i]<0) {
                throw new NegativeNumberException(a[i]);
            }
            else if((a[i]/10)%2==0) {
            throw new NumberDivby10EvenException(a[i]);
        }
            else if(a[i]>1000&&a[i]<2000) {
            throw new Gre1000AndLes2000Exception(a[i]);
        }
            else if(a[i]>7000) {
            throw new Gre7000Exception(a[i]);
        }
            else{
                sum=sum+a[i];
        }
        }
        catch(NegativeNumberException e1) {
                System.out.println("Negative number arises an exception..."+e1);
                }
        catch(NumberDivby10EvenException e2) {
                System.out.println("Number divisible by 10 is even arises an exception..."+e2);
                }
        catch(Gre1000AndLes2000Exception e3) {
                System.out.println("Number greater than 1000 and less than 2000 arises an exception..."+e3);
                }
        catch(Gre7000Exception e4) {
                System.out.println("Number greater than 7000 arises an exception..."+e4);
                }
    }
        System.out.println("Sum="+sum);
    }
    
}
class NegativeNumberException extends Exception {
    private int s;
    NegativeNumberException(int s1) {
        s=s1;
    }
    public String toString() {
        return ("Exception occurs in number "+s);
    }
}
class NumberDivby10EvenException extends Exception {
    private  int s;
    NumberDivby10EvenException(int s1) {
        s=s1;
    }
    public  String toString() {
        return ("Exception occurs in number "+s);
    }
}
class Gre1000AndLes2000Exception extends Exception {
    private  int s;
    Gre1000AndLes2000Exception(int s1) {
        s=s1;
    }
    public String toString() {
        return ("Exception occurs in number "+s);
    }
}
class Gre7000Exception extends Exception {
    private int s;
    Gre7000Exception(int s1) {
        s=s1;
    }
    public String toString() {
        return ("Exception occurs in number "+s);
    }
}


