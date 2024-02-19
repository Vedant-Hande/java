import java.util.*;

class example {
    Scanner sc = new Scanner(System.in);
    int roll_no;

    void getroll() {
        System.out.println("roll=");
        roll_no = sc.nextInt();
    }

    void putroll() {
        System.out.println("roll=" + roll_no);
    }

}

class demo extends example {
    int marks;

    void getmarks() {
        System.out.println("marks=");
        marks = sc.nextInt();
    }

    void putmarks() {
        System.out.println("marks=" + marks);
    }
}

class herarchi1 extends example {
    public static void main(String[] args) {
        demo d = new demo();
        herarchi1 h = new herarchi1();

        h.getroll();
        d.getmarks();
        h.putroll();
        d.putmarks();
    }
}
