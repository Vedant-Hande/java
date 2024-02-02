import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        System.out.println("enter the position : ");
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        System.out.println("Enter your choice to update the bit  : \n 1 SETBIT : \n 2: clear bit  ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("SET BIT : ");
                int newnumber = bitmask | num;
                System.out.println("new number : " + newnumber);
                break;
                /*
                 * bit mask = 1<<1 { 0001<<1 }
                 * bit mask = 0010  
                 * OR = 0010 | 0101 { 5 }
                 * result = 0 1 1 1 { 7 }
                 * 3 2 1 0
                 * than ans : new num : "7"
                 * 
                 */
            }
            case 2: {
                System.out.println("CLEAR BIT");
                int newbitmask = ~bitmask;
                int newnumber = newbitmask & num;
                System.out.println("new number : " + newnumber);
                break;
                /*
                 * bit mask = 1<<2 { 0001<<2 }
                 * bit mask = 0100
                 * AND = ~0100 {(1011) & 0101} { 5 } 0001 = 1110 & 0101 = 0100
                 * result = 0 0 0 1 { 1 }
                 * 3 2 1 0
                 * than ans : new num : "1"
                 * 
                 */

            }
            default: {
                System.out.println("you enter the wrong choice !");
                break;
            }
        }
        sc.close();

    }
}
