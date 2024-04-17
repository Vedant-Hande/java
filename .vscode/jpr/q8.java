// 8.	Write a program to display area and perimeter of rectangle.

import java.util.Scanner;

class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter lenght of rectangle - ");
        float length = sc.nextFloat();

        System.out.println("enter width of rectangle - ");
        float width = sc.nextFloat();

        double area = (length * width);
        double perimeter = (2 * length * width);

        System.out.println("area of rectangle = " + area);
        System.out.println("perimeter of rectangle = " + perimeter);
        sc.close();
    }
}
