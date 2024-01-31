import java.util.Scanner;

public class exe12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("enter your friend name : ");
        String name = sc.nextLine();
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                result = result + " i love yu "; // result += result"string"
=======
        String name = sc.next();
        String result = " ";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                result += "i love yu";
>>>>>>> cd09b5e708e9719cb992308b1bd75eafc266bafa
            } else {
                result += name.charAt(i);
            }

        }
        System.out.println(result);
        sc.close();

    }
}
