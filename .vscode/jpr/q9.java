//9.	Write a program to print reverse of any number

import java.util.Scanner;

class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rev = 0, rem = 0;
        n = sc.nextInt();
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();
    }

}
