import java.util.*;

public class arrpr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int array[] = new int[size];
        System.out.println("enter the array element s");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("output");
        for (int i = 0; i < size; i++) {
            System.out.println("array element at index " + i + " is = " + array[i]);
        }
        sc.close();
    }
}