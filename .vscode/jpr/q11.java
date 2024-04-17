// q11
// 11.	Write a program to class student ,data member student name,ID,marks
// ,class.Accept and display above data using object.

import java.util.Scanner;

class student {
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    float marks;
    void setdata() {
        System.out.println("enter the name :");
        name = sc.nextLine();
        System.out.println("enter the id :");
        id = sc.nextInt();
        System.out.println("enter the marks :");
        marks = sc.nextFloat();
    }
    void getdata() {
        System.out.println(" name : " + name);
        System.out.println(" id  : " + id);
        System.out.println(" marks : " + marks);
    }
}
class q11 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setdata();
        s1.getdata();
    }
}
