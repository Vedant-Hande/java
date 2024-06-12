import java.util.Scanner;

public class Array_addation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // giving the size of the array
        System.out.print("enter the size of array - ");
        int size_of_array = sc.nextInt();
        // array creation
        int arr[] = new int[size_of_array];
        // entering the array of the element
        System.out.println("enter the array elements - ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // accessing the data
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

// root