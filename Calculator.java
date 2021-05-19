public class Calculator {
    public static void main(String[] args) {
        String a=args[0].replaceAll(" ","");
        a=a.replaceAll("[+]","#+#");
        a=a.replaceAll("[-]","#-#");
        a=a.replaceAll("[*]","#*#");
        a=a.replaceAll("[/]","#/#");
        args=a.split("#");
        System.out.println("String:"+a+"\n"+args[0]+" "+args[1]+" "+args[2]);
        if(args.length!=3)
        {
            System.out.println("Usage java calculator operand1 operator operand2");
            System.exit(0);
        }
        int result=0;
        switch(args[1].charAt(0))
        {
            case '+' : result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
                       break;
            case '-' : result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
                       break;
            case '*' : result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
                       break;
            case '/' : result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
                       break;           
        }
        System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
    }
}