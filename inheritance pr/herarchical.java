
import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);

    int id;

    void setdata() {
        System.out.println("Enter the id :");
        id = sc.nextInt();

    }

    void getdata() {
        System.out.println("id : " + id);
    }
}

class single extends student {
    String name;

    void set() {

        System.out.println("enter the name : ");
        name = sc.next();
    }

    void get() {
        System.out.println("Name :" + name);

    }
}

public class herarchical extends student {
    public static void main(String[] args) {
        herarchical s1 = new herarchical();
        single s2 = new single();

        s1.setdata();
        s2.set();
        s1.getdata();
        s2.get();
    }

}
