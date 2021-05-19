import java.util.ArrayList;
import java.util.Date;
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<Object>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new String("String object"));
        list.add(new Circle());
        for(int j=0;j<list.size();j++)
        {
             System.out.println(list.get(j).toString());
        }
    }   
}
