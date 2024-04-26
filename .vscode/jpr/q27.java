import java.util.Scanner;

class noMatch extends Exception {
    public noMatch(String str) {

        super(str);
    }
}

public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        try {

            System.out.println("enter pass ");
            pass = sc.next();
            if (pass.compareTo("MSBTE") == 0) {
                System.out.println("PASSWORD MATCH ");

            } else {
                throw new noMatch("PASSWORD DON'T MATCH ");
            }
        }

        catch (noMatch e) {
            System.out.println(e.toString());

        } finally {
            System.out.println("rest of the code ");
        }
        sc.close();
    }
}
