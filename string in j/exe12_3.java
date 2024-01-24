import java.util.Scanner;

public class exe12_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the new email : ");
        String email = sc.nextLine();
        // String dele = "";
        String user_name = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                // dele += email.charAt(i);
                break;
            } else {
                user_name += email.charAt(i);
            }

        }
        System.out.println(user_name);
        sc.close();
    }
}
