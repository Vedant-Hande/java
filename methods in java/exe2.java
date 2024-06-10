//2. Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

class fun_c {
    int sum_of_odd_num(int num) {
        int i, sum = 0;
        for (i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

public class exe2 extends fun_c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        exe2 s1 = new exe2();
        int n;
        n = sc.nextInt();
        System.out.println(" sum of all odd numbers :  " + s1.sum_of_odd_num(n));
        sc.close();
    }
}
