import java.util.Scanner;
class book{
    protected String title;
    protected String author;
    book(){
        title="unknown";
        author="unknown";
    }
    void setTitle(String n){
        title = n;
    }
    void setAuthor(String name){
        author = name;
    }
}
class bookDetails extends book{
    protected float price;
    protected int stock;
    bookDetails(){
        price=0;
        stock=0;
    }
    void setPrice(float n){
        price = n;
    }
    void setStock(int n){
        stock = n;
    }
    void DetailsforTheBOOk(){
        System.out.println("Author          : "+author);
        System.out.println("Title           : "+title);
        System.out.println("Price           : "+price);
        System.out.println("Remaining stock : "+stock);
    }
    void sell(int n){
        stock+=n;
        System.out.println("here your "+n*price+" Rs. for "+n+" books");
    }
    void purchase(int n){
        if(stock!=0){
            stock-=n;
            System.out.println("That would be "+n*price+" Rs. for "+n+" books");}
        else{
            System.out.println("The stock is empty for "+title);}
    }
}
public class prac7_2{
    public static void main(String[] args)
    {   String id; int nbook;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of books");
        int n = s.nextInt();
        bookDetails obj[]= new bookDetails[n];
        for(int i=0;i<n;i++)
        {
            obj[i] = new bookDetails();
            System.out.print("Enter the Title of the book "+i+" :");
            obj[i].setTitle(s.next()); 
            System.out.print("Authors name :");
            obj[i].setAuthor(s.next()); 
            System.out.print("Enter the price of the book:");
            obj[i].setPrice(s.nextFloat()); 
            System.out.print("Enter the remaining stock of this book:");
            obj[i].setStock(s.nextInt()); 
        }
        while(true){
            System.out.println("Enter \n1 for the details of a book\n2 for purchasing a book\n3 for selling a book\n4 for quittinga");
            int temp=s.nextInt();
            switch(temp){
                case 1: System.out.println("Enter the Author's name or Title of the book");
                        id = s.next();
                        for(int i=0;i<n;i++){
                            if(obj[i].author.toUpperCase().equals(id.toUpperCase()) || obj[i].title.toUpperCase().equals(id.toUpperCase())){
                                obj[i].DetailsforTheBOOk();
                            }
                        }
                        break;
                case 2:System.out.println("Enter the book(s) you want to purchase or the authors name");
                        id = s.next();
                        System.out.println("How many books do you want??");
                        nbook = s.nextInt();
                        for(int i=0;i<n;i++){
                            if(obj[i].author.toUpperCase().equals(id.toUpperCase()) || obj[i].title.toUpperCase().equals(id.toUpperCase())){
                                obj[i].purchase(nbook);}
                            else{
                                System.out.println("We don't have that book");}
                        }
                        break;
                case 3:System.out.println("Enter name of the book you want to sell");
                        id = s.next();
                        System.out.println("How many book do you want to sell");
                        nbook = s.nextInt();
                        for(int i=0;i<n;i++){
                            if(obj[i].author.toUpperCase().equals(id.toUpperCase()) || obj[i].title.toUpperCase().equals(id.toUpperCase())){
                                obj[i].sell(nbook);}
                            else{
                                System.out.println("Sry we dont want Buy this book");}
                        }
            }
            if(temp==4)
                break;
        }
    }
}