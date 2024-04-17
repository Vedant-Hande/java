// 7.	Write a program to calculate simple interest using formula (SI=P*N*R)/100.

import java.util.Scanner;

class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter principal amount : ");
        double P = sc.nextDouble();

        System.out.println("enter rate of interest :");
        double R = sc.nextDouble();

        System.out.println("enter time period :");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;

        System.out.println("Simple interest SI = " + SI);
        sc.close();
    }
}
