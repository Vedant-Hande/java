//1.Write a program to print average of three numbers and display it.

import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("enter the 3 numbers : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        System.out.println("average of three numbers = " + (n1 + n2 + n3) / 3);
        sc.close();
    }

}
