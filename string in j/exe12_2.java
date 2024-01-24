import java.util.Scanner;

public class exe12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String result = " ";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                result += "i love yu";
            } else {
                result += name.charAt(i);
            }

        }
        System.out.println(result);
        sc.close();

    }
}
