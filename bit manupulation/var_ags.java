import java.util.Scanner;

class student {
    int roll;
    String name;

    student(int r, String n) {
        roll = r;
        name = n;
    }

    void show() {
        System.out.println("roll : " + roll + " name : " + name);
    }
}

public class var_ags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1[] = new student[5];
        s1[0] = new student(1, "ved");
        s1[1] = new student(2, "om");
        s1[2] = new student(3, "ram");
        s1[3] = new student(4, "sham");
        s1[4] = new student(5, "sahil");
        s1[0].show();
        s1[1].show();
        s1[2].show();
        s1[3].show();
        s1[4].show();
        sc.close();
    }
}