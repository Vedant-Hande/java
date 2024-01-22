//5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util. Scanner;
public class exe4 {
   public static void vote_Eligible(int age){
    if(age>18){
        System.out.println("the person is eligible foe the voting "+age);
    }
    else{
        System.out.println("the person is not eligible for the voting "+age);

    }
   }
    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the age if voter : ");
        age= sc.nextInt();
        vote_Eligible(age);
        sc.close();
    }
}
