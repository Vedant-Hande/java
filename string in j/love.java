import java.util.Scanner;

public class love {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name : ");
        String me = sc.next();
        System.out.println("enter name  of your love : ");
        String love = sc.next();
        String both = me + " " + love;
        String 
        for (int i = 0; i < both.length(); i++) {
            if (both.charAt(i) == ' ') {
                result = result + " i love you " + love; // result += result"string"

            } else {
                result += result.charAt(i);
            }

        }
        System.out.println(result);
        sc.close();

    }
}
