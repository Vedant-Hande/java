/*1. Develop a program to create a class ‘Book’ having data members ‘author’, ‘title’ and ‘price’.
 Derive a class ‘BookInfo’ having data member ‘stockposition’ and method to initialize and display the information for three objects. */
import java.util.*;
class book {
    Scanner sc = new Scanner(System.in);
    
    String author;
    String title;
    float price;
}
class bookinfo extends book {
    int stackpoint;
    void setdata() {
        System.out.println("enter the author name: ");
        author = sc.next();
        System.out.println("enter the title of book: ");
        title = sc.next();
        System.out.println("enter the price of  book: ");
        price = sc.nextFloat();
        System.out.println("enter the stackpoint: ");
        stackpoint = sc.nextInt();
    }
    void getdata() {
        System.out.println("author: " + author);
        System.out.println("title: " + title);
        System.out.println("price: " + price);
        System.out.println("stackpoint:" + stackpoint);
    }

    public static void main(String[] args) {
        bookinfo bi[] = new bookinfo[3];
        for (int i = 0; i < 3; i++) {
            bi[i] = new bookinfo();
            bi[i].setdata();
        }
        for (int i = 0; i < 3; i++) {
            bi[i].getdata();
        }

    }

}
