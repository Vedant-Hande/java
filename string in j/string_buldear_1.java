import java.util.Scanner;

public class string_buldear_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("vedant");
        System.out.println(str);
        System.out.println(str.charAt(0));

        str.setCharAt(0, 's'); // set char 's'
        System.out.println(str);

        str.insert(4, 'h'); // insert the char h at the position num 4
        System.out.println(str);

        str.setCharAt(0, 'v'); // again set the char v to the position num 0
        System.out.println(str);

        // delete
        str.delete(4, 5);
        System.out.println(str);

        // append fun
        StringBuilder sb = new StringBuilder("t");
        sb.append('o');
        sb.append('n');
        sb.append('y');
        System.out.println(sb);
        System.out.println(sb.length());

        // reverse fun
        StringBuilder sb1 = new StringBuilder("vedant");

        for (int i = 0; i <= sb1.length() / 2; i++) {
            int front = i;
            int back = sb1.length() - 1 - i;
            // [6-1-0 = 5 || 6-1-1 = 4]
            char fchar, bchar;
            fchar = sb1.charAt(front);
            bchar = sb1.charAt(back);
            sb1.setCharAt(back, fchar);
            sb1.setCharAt(front, bchar);

        }
        System.out.println("rev str : " + sb1);
        sc.close();

    }
}
