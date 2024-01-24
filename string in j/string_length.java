import java.util.Scanner;

public class string_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // length function
        String fname = "vedant";
        String lname = "hande";
        System.out.println("The lenght of an string 1 : " + fname.length());
        System.out.println("The lenght of an string 2 : " + lname.length());

        // charAt funcation in string [ it read the sting letter by letter]
        for (int i = 0; i < fname.length(); i++) {
            System.out.print("\t" + fname.charAt(i) + " \n");
        }
        System.out.println(" the lname string : ");
        System.out.println("\t" + lname.charAt(4));
        sc.close();

    }
}
