import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sen = new StringBuilder("welcome to java programing ");
    
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    // count the number word in the sentance
                    int count = 0;
                    for (int i = 0; i < sen.length(); i++) {
                        if (sen.charAt(i) == ' ') {
                            count++;
                        }

                    }
                    System.out.println("number of word is : " + count);
                    break;
                }
                case 2: {

                    // finding the length of string
                    System.out.println("lenght of string is : " + sen.length());
                    break;
                }
                case 3: {

                    // display the string in to reverse order
                    for (int i = 0; i < sen.length() / 2; i++) { // len/2 28/2
                        int front = i;
                        int back = sen.length() - 1 - i;
                        // [6-1-0 = 5 || 6-1-1 = 4]
                        char fchar, bchar;
                        fchar = sen.charAt(front);
                        bchar = sen.charAt(back);
                        sen.setCharAt(back, fchar);
                        sen.setCharAt(front, bchar);

                    }
                    System.out.println("rev string :" + sen);
                    break;

                }
                case 4: {

                    // change the string
                    sen.append('j');
                    sen.append('a');
                    sen.append('v');
                    sen.append('a');
                    System.out.println("changable string :" + sen);
                    break;

                }
                case 5: {
                    System.out.println("exit point ");
                    break;
                }
                default: {
                    System.out.println("yu enter the wrong choice plz enter the correct choice !");
                    break;
                }
            }
        sc.close();
    }
}
