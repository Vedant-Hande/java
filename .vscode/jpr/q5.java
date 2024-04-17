// 5.	Write a program to print given pattern using for loop .
// *  
// **     
// ***    
// ****

class q5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
