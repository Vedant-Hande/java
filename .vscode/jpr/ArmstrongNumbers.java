public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        // store the number of digits of num in nnnn
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // store the result of num
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // check if num is equal to the result
        return result == num;
    } 
}