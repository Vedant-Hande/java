
// package inheritance pr;
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

class multilevel extends single {
    public static void main(String[] args) {
        multilevel s1 = new multilevel();
        s1.setdata();
        s1.set();
        s1.getdata();
        s1.get();
    }
}
