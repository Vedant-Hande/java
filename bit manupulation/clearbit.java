//use the NOT on bitmask and than use the AND opreation in the NOt bitmask to clear bit
public class clearbit {
    public static void main(String[] args) {
        int num = 5; // 0101 = 5
        int pos = 2;
        int bitmask = 1 << pos;
        int notbikmask = ~bitmask;
        int newnumber = notbikmask & num;
        System.out.println("new number is : " + newnumber);
        /*
         * bit mask = 1<<2 { 0001<<2 }
         * bit mask = 0100
         * AND = ~0100 {(1011) & 0101} { 5 }
         * result = 0 0 0 1 { 1 }
         * 3 2 1 0
         * than ans : new num : "1"
         * 
         */

    }

}
