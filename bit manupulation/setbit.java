
public class setbit {

    // use the OR operation in the java to set the bit set bit means 0 to 1

    public static void main(String[] args) {
        int num = 5; // 0101 = 5
        int pos = 1;
        int bitmask = 1 << pos;
        int newnumber = bitmask | num;
        System.out.println("new number is : " + newnumber);

        /*
         * bit mask = 1<<1 { 0001<<1 }
         * bit mask = 0010
         * OR = 0010 | 0101 { 5 }
         * result = 0 1 1 1 { 7 }
         *          3 2 1 0
         * than ans : new num : "7"
         * 
         */

        int num1 = 7; // 0111 = 7
        int pos1 = 3;
        int bitmask1 = 1 << pos1;
        int newnumber1 = bitmask1 | num1;
        System.out.println("new number is : " + newnumber1);

        /*
         * bit mask = 1<<3 { 0001<<3 }
         * bit mask = 1000
         * OR = 1000 | 0111 { 7 }
         * result = 1 1 1 1 { 7 }
         *          3 2 1 0
         * wei = 16 8 4 2 1
         * than ans : new num : "15"
         * 
         */
    }
}
