import java.util.Scanner;

public class stri_arr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        byte strlen;
        strlen = sc.nextByte();
        String name[] = new String[strlen];
        System.out.println("enter the names pof student's : ");
        for (int i = 0; i < strlen; i++) {
           System.out.print((i+1)+" : ");
           name[i] = sc.next();
        }
        System.err.println();
        System.out.println("name of student is ");
        for (int i = 0; i < strlen; i++) {
            System.out.println((i+1)+" : "+name[i]);
        }
sc.close();
    }
}
