import java.util.*;

class students {
    Scanner sc = new Scanner(System.in);
    int roll_num;
    String name;
    float marks;

    students() {
        System.out.println("enter the roll name and marks :");
        // roll_num = sc.nextInt();
        // name = sc.nextLine();
        // marks = sc.nextFloat();
        roll_num = 1;
        name = "sarthak";
        marks = 90;
    }

    students(int r, String n, float m) {
        roll_num = r;
        name = n;
        marks = m;
    }

    void get() {
        System.out.println("roll num " + roll_num);
        System.out.println("name " + name);
        System.out.println("marks " + marks);
    }
}

class load1 {
    public static void main(String[] args) {
        students stu1 = new students();
        students stu2 = new students(2, "vedant", 88);
        stu1.get();
        stu2.get();

    }
}
