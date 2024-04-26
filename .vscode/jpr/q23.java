import java.util.Scanner;

class single {
    Scanner sc = new Scanner(System.in);
    int roll_no;
    String name;

    void acceptdata() {
        System.out.println("enter your name=");
        name = sc.nextLine();
        System.out.println("ENTER YOUR ROLL_NO=");
        roll_no = sc.nextInt();
    }

    void displaydata() {
        System.out.println("NMAE+" + name);
        System.out.println("ROLL_NO=" + roll_no);
    }
}

public class q23 extends single {
    public static void main(String[] args) {
        q23 q = new q23();
        q.displaydata();
        q.acceptdata();
    }
}
