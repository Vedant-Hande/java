import java.util.*;

public class arrayq1 {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        int sum = 0, avg = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            avg = sum / size;
        }
        System.out.println("the total addation : " + sum);
        System.out.println("the avg : " + avg);
        sc.close();
    }
}
