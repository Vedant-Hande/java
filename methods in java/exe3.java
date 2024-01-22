//3. Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class exe3 {

    public static void printgreater(int x, int y) {
        if (x > y) {
            System.out.println(x + " is greater ");
        } else {
            System.out.println(y + " is greater ");
        }
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        printgreater(a, b);
        sc.close();
    }
}
