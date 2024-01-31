import java.util.Scanner;

class student {
    int roll;
    String name;
    int per;

    student() {
        roll = 1;
        name = "sarthak";
        per = 90;
    }

    student(int r, String n, int p) {
        roll = r;
        name = n;
        per = p;

    }

    void show() {
        System.out.println("roll :" + roll + " name : " + name + " per : " + per);
    }
}

public class cons_overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        student s2 = new student(2, "vedant", 88);
        s1.show();
        s2.show();
        sc.close();
    }
}
