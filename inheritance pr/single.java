
// package inheritance pr;
import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);

    int id;
    String name;

    void setdata() {
        System.out.println("Enter the id :");
        id = sc.nextInt();
        System.out.println("enter the name : ");
        name = sc.next();

    }

    void getdata() {
        System.out.println("id : " + id);
        System.out.println("Name :" + name);
    }
}

class single extends student {
    public static void main(String[] args) {
        single s1 = new single();
        s1.setdata();
        // s1.setdata();
        s1.getdata();

    }
}
