import java.util.*;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a, b, c;
        System.out.println("Enter the numbers-");
        a = sc.nextByte();
        b = sc.nextByte();
        c = sc.nextByte();
        sc.close();
        if (a > b && a > c) {
            System.out.println("a is the greater " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greater " + b);
        } else {
            System.out.println("c is greater " + c);
        }

    }
}
