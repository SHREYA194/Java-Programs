package javaapplication3;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of books you want to add in array : ");
        int n=in.nextInt();
         BookDetails obj[]=new BookDetails[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter book's title : ");
            String t=in.next();
            System.out.print("Enter book's author name : ");
            String a=in.next();
            System.out.print("Enter price of the book : ");
            float p=in.nextFloat();
            System.out.print("Enter the remaining stock of this book : ");
            int s=in.nextInt();
            obj[i]=new BookDetails(t,a,p,s);
        }
        while(true) {
            System.out.println("1.Details of book.    2.Purchaising book.    3.Selling book.     4.Quit.");
            System.out.print("Enter your choice:");
            int ch=in.nextInt();
            int i,nbook;
            boolean avail;
           
            switch(ch) {
                case 1:System.out.print("Enter book's title and author name : ");
                       String ti=in.next();
                       String au=in.next();
                        for(i=0;i<n;i++) {
                            avail=obj[i].bookAvailability(ti,au);
                            if(avail==true) obj[i].bookDetails(avail);
                        }
                        break;
                case 2:System.out.print("Enter book's title and author name and number of books you want to purchase : ");
                        ti=in.next();
                        au=in.next();
                        nbook=in.nextInt();
                        for(i=0;i<n;i++) {
                            avail=obj[i].bookAvailability(ti,au);
                            if(avail==true) obj[i].purchase(avail,nbook);
                        }
                        break;
                case 3:System.out.print("Enter book's title and author name and number of books you want to sell : ");
                        ti=in.next();
                        au=in.next();
                        nbook=in.nextInt();
                        for(i=0;i<n;i++) {
                            avail=obj[i].bookAvailability(ti,au);
                            if(avail==true) obj[i].sell(avail,nbook);
                        }
            }if(ch==4) break;
        }
    }
}
class Book {
    protected String title;
    protected String authorName;
    public Book() {    
    }
    public Book(String title,String authorName) {
        this.title=title;
        this.authorName=authorName;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthorName() {
        return authorName;
    }
    /*public void setTitle(String title) {
        this.title=title;
    }
    public void setAuthorName(String authorName) {
        this.authorName=authorName;
    }*/
    public boolean bookAvailability(String tit,String authNa) {
        return title.toUpperCase().equals(tit.toUpperCase()) && authorName.toUpperCase().equals(authNa.toUpperCase());
    }
        
}
class BookDetails extends Book {
    protected float price;
    protected int currentStock;
    public BookDetails() {
        
    }
    /*public BookDetails(int price,int currentStock) {
        this.price=price;
        this.currentStock=currentStock;
    }*/
    public BookDetails(String title,String authorName,float price,int currentStock) {
        super(title,authorName);
        this.price=price;
        this.currentStock=currentStock;
    }
    public float getPrice() {
        return price;
    }
    public int getCurrentStock() {
        return currentStock;
    }
    /*public void setPrice(float price) {
        this.price=price;
    }
    public void setCurrentStock(int currentStock) {
        this.currentStock=currentStock;
    }*/
    public void purchase(boolean bookAvailability,int numbook) {
        if(true)
            currentStock += numbook;
    }
    public void sell(boolean bookAvailability,int numbook) {
        if(true && numbook<=currentStock)
            currentStock -=numbook;
        else System.out.println("Current Stock is : "+currentStock);
    }
    public void bookDetails(boolean bookAvailability) {
        if(true) {
            System.out.println("title="+title+" authorname="+authorName+" price="+price+" currentStock="+currentStock);
        }
        else {
            System.out.println("book is not available.");
        }
    }
}