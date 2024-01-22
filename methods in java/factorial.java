
import java.util.Scanner;

public class factorial {
    public static void printfactriol(int num) {
        int i, factorial = 1;
        if (num < 0) {
            System.out.println("invalid number");
            return;

        }
        for (i = num; i >= 1; i--) {
            factorial = (factorial * i);
        }
        System.out.println("the factorial of an " + num + " is : " + factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the fictorial : ");
        int num = sc.nextInt();
        printfactriol(num);
        sc.close();

    }
}
