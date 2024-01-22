import java.util.*;

public class table {
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-");
        num = sc.nextInt();
        sc.close();
        for (i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
