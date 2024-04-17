// 6.	Write a program to print given pattern using for loop. 
// 1  
// 12 
// 123  
// 1234

class q6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
    }
}
