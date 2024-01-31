import java.util.*;

public class stringq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");

        // StringBuffer str = new StringBuffer(sc.nextLine());
        String str = sc.nextLine();
        int count_v = 0, count_c = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                count_v++;
            } else if (str.charAt(i) == 'e') {
                // str.replace('e', 'x');
                count_v++;
            } else if (str.charAt(i) == 'i') {
                count_v++;
            } else if (str.charAt(i) == 'o') {
                count_v++;
            } else if (str.charAt(i) == 'u') {
                count_v++;
            } else {
                count_c++;
            }
        }
        System.out.println("replace char is : " + str.replace('e', 'x'));
        System.out.println("total vowle in the string  is :" + count_v);
        System.out.println("total consonent in the string  is :" + count_c);
        sc.close();
    }
}
