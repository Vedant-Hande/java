
// package inheritance pr;
import java.util.*;

public class student {
    Scanner sc = new Scanner(System.in);

    public static int setdata(int id) {
        return id;
    }

    public static String getdata(String name) {
        return name;
    }

    // }
    // class single extends student {
    public static void main(String[] args) {
        int a = 48;
        String b = "vedant";
        setdata(a);
        getdata(b);
        // single s1 = new single();
        // s1.setdata(48);
        // s1.getdata("vedant");
    }
}
