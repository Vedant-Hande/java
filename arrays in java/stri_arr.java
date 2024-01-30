import java.util.Scanner;

public class stri_arr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        byte str_len;
        str_len = sc.nextByte();
        String name[] = new String[str_len];
        System.out.println("enter the names of student's : ");
        for (int i = 0; i < str_len; i++) {
            System.out.print((i + 1) + " : ");
            name[i] = sc.next();
        }
        System.err.println();
        System.out.println("name of student is ");
        for (int i = 0; i < str_len; i++) {
            System.out.println((i + 1) + " : " + name[i]);
        }
        sc.close();
    }
}
