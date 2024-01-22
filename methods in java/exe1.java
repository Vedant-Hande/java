
//1. Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class exe1 {
    public static int printavg(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("the avg of an numbers is : " + printavg(a, b, c));
        sc.close();
    }
}
