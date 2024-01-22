import java.util.Scanner;

public class using_length_function {


    public static void main(String args[]) {
        int size, x = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array =");
        size = sc.nextInt();

        int number[] = new int[size];
        System.out.println("Enter the numbers = ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (x == number[i]) {

                System.out.println(" The x is " + number[i] + " found at the location " + i);
            }

        }

        sc.close();
    }
}

