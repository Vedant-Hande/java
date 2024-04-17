//4.	Write a program to print number is even or odd and display it.

import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number - ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("the number is even " + num);
        } else {
            System.out.println("the number is odd " + num);
        }
        sc.close();
    }
}
