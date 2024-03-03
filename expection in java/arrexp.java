import java.util.Scanner;

class arrexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        System.out.println("enter the index to divide he number : ");
        int ind = sc.nextInt();
        System.out.println("enter the number to divide the array number : ");
        int num = sc.nextInt();
        try {
            System.out.println("The index number is :" + marks[ind]);
            System.out.println("after divide the num by " + num + " is :" + marks[ind] / num);

        } catch (Exception e) {
            System.out.println("some Expection  is occurse! \n" + e);
        }
        sc.close();
    }
}