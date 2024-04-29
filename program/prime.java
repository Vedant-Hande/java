package program;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        int flag = 0;
        System.out.println("enter the num- ");
        n = sc.nextInt();
        sc.close();
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(n + " the num is not prime");
        } else {
            System.out.println(n + " prime num");
        }

    }
}
