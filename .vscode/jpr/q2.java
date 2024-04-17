//2.	Write a program to print factorial of any number.

import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact = 1;
        System.out.println("enter the number to find the factorial - ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of the num " + n + " is = " + fact);
        sc.close();
    }
}
