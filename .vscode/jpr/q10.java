
//10.	Write a menu driven program using switch case to enter marks and percentage and 
// display result of first class, second class, fail, pass and distinction
import java.util.Scanner;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks, totalMarks = 500;
        double percentage;

        System.out.println("Enter marks obtained (out of 500): ");
        marks = sc.nextInt();

        percentage = (marks / totalMarks) * 100;

        int result;
        if (percentage >= 80) {
            result = 1; // Distinction
        } else if (percentage >= 60) {
            result = 2; // First Class
        } else if (percentage >= 50) {
            result = 3; // Second Class
        } else if (percentage >= 40) {
            result = 4; // Pass
        } else {
            result = 5; // Fail
        }

        switch (result) {
            case 1:
                System.out.println("Result: Distinction");
                break;
            case 2:
                System.out.println("Result: First Class");
                break;
            case 3:
                System.out.println("Result: Second Class");
                break;
            case 4:
                System.out.println("Result: Pass");
                break;
            case 5:
                System.out.println("Result: Fail");
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}