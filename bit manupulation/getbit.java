
// use the AND operation in the java  to get the bit 
public class getbit {
    public static void main(String[] args) {
        int num = 5; // 0101 = 5
        int pos = 3;
        int bitmask = 1 << pos;
        if ((bitmask & num) == 0) {
            System.out.println("bit is zero : '0'");
        } else {
            System.out.println("The bits is one : '1'");
        }
    }
}
/*
 * bit mask = 1<<2 { 0001<<2 } 1<<3
 * bit mask = 0100 1000
 * AND = 0100 & 0101 { 5 } 1000 & 0101
 * result = 0 1 0 0 0 0 0 0
 * 3 2 1 0
 * than ans : the postion num 2 bit gets "1" bit gets "0"
 * 
 */